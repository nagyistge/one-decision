package io.onedecision.engine.decisions.model.ui;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 * Decision Rule allowed input
 * 
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name = "OL_UI_INPUT")
public class DecisionInput extends DecisionExpression {

    private static final long serialVersionUID = 5101150032325522668L;

    public DecisionInput withName(String name) {
        setName(name);
        return this;
    }

    public DecisionInput withLabel(String label) {
        setLabel(label);
        return this;
    }

}
