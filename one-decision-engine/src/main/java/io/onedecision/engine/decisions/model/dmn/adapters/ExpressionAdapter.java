package io.onedecision.engine.decisions.model.dmn.adapters;

import io.onedecision.engine.decisions.model.dmn.DecisionModelImport;
import io.onedecision.engine.decisions.model.dmn.Definitions;
import io.onedecision.engine.decisions.model.dmn.Expression;
import io.onedecision.engine.decisions.model.dmn.LiteralExpression;
import io.onedecision.engine.decisions.model.dmn.ObjectFactory;
import io.onedecision.engine.decisions.model.dmn.Text;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.adapters.XmlAdapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.w3c.dom.Element;

public class ExpressionAdapter extends
        XmlAdapter<ExpressionAdapter.AdaptedExpression, Expression> {

    protected static final Logger LOGGER = LoggerFactory
            .getLogger(ExpressionAdapter.class);

	protected ObjectFactory objFact = new ObjectFactory();

    // @XmlRootElement(name = "Decision")
    public static class AdaptedExpression extends Expression {

        // @XmlElementRef(name = "inputVariable", namespace =
        // "http://www.omg.org/spec/DMN/20130901", type = JAXBElement.class,
        // required = false)
        // protected List<JAXBElement<Object>> inputVariable;
        // protected QName itemDefinition;

		@XmlElement(name = "text", namespace = Definitions.DMN_1_0)
        protected Text text;
        @XmlElement(name = "Import")
        protected DecisionModelImport _import;
        @XmlAttribute(name = "expressionLanguage")
        @XmlSchemaType(name = "anyURI")
        protected String expressionLanguage;

        public Text getText() {
            return text;
        }

        public void setText(Text text) {
            this.text = text;
        }
    }

    @Override
    public Expression unmarshal(AdaptedExpression v) {
        if (null == v) {
            return null;
        }
        if (isLiteral(v)) {
            LiteralExpression literal = new LiteralExpression();
            adaptToExpression(v, literal);
            // TODO replaced el.getTextContent here
            Element el = findElement(v, "text");
			Text txt = objFact.createTLiteralExpressionText();
			literal.setText(txt.addContent(el.getFirstChild()
                    .getNodeValue()));
            literal.setImport(v._import);
            literal.setExpressionLanguage(v.expressionLanguage);
            return literal;
        } else {
            return adaptToExpression(v, new LiteralExpression());
        }
    }

    private Expression adaptToExpression(AdaptedExpression v,
            Expression expression) {
        BeanUtils.copyProperties(v, expression);
        expression.getInputVariable().addAll(v.getInputVariable());
        expression.setItemDefinition(v.getItemDefinition());
        return expression;
    }

    @Override
    public AdaptedExpression marshal(Expression v) throws Exception {
        if (null == v) {
            return null;
        }
        AdaptedExpression adaptedExpression = new AdaptedExpression();
        BeanUtils.copyProperties(v, adaptedExpression);
        try {
            adaptedExpression.getInputVariable().addAll(v.getInputVariable());
        } catch (Exception e) {
            // TODO
            e.getMessage();
        }
        if (v instanceof LiteralExpression) {
            LiteralExpression literal = (LiteralExpression) v;
            adaptedExpression.setId(literal.getId());
            adaptedExpression.setName(literal.getName());
            adaptedExpression.setDescription(literal.getDescription());
            adaptedExpression.text = literal.getText();
            if (literal.getText() != null
                    && literal.getText().getContent() != null
                    && literal.getText().getContent().size() > 0) {
                System.out.println("Have text for literal: "
                        + literal.getText().getContent());
                assert (adaptedExpression.getText().getContent().size() == literal
                        .getText().getContent().size());
            }
        } else if (v instanceof Expression) {
            // continue
            LOGGER.warn("Ignoring mashalling of abstract expression: "
                    + v.getId());
        } else {
            // Cannot happen?
            LOGGER.error("Unrecognised expression sub-type: "
                    + v.getClass().getName());
        }
        return adaptedExpression;
    }

    private static boolean isLiteral(final Expression v) {
        return findElement(v, "text") != null;
    }

    private static Element findElement(final Expression v, final String name) {
        Element el = null;
        for (Object o : v.getAny()) {
            if (o instanceof Element
                    && name.equals(((Element) o).getLocalName())) {
                el = (Element) o;
            }
        }
        return el;
    }

}
