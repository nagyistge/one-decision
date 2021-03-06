/*******************************************************************************
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package io.onedecision.engine.decisions.model.ui;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "OL_UI_RULE")
@Component
public class DecisionRule implements Serializable {

    private static final long serialVersionUID = -6779322287292907493L;

    protected static final Logger LOGGER = LoggerFactory.getLogger(DecisionRule.class);

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty
    private Long id;

    @JsonProperty 
    protected String[] inputEntries;

    @JsonProperty
    protected String[] outputEntries;

    public DecisionRule() {}

    public DecisionRule(String[] inputEntries, String[] outputEntries) {
        setInputEntries(inputEntries);
        setOutputEntries(outputEntries);
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String[] getInputEntries() {
		return inputEntries;
	}

    public void setInputEntries(String[] inputEntries) {
        this.inputEntries = inputEntries;
	}

    public String[] getOutputEntries() {
        return outputEntries;
    }

    public void setOutputEntries(String[] outputEntries) {
        this.outputEntries = outputEntries;
    }

    public DecisionRule withInputEntries(String[] inputEntries) {
        setInputEntries(inputEntries);
        return this;
    }

    public DecisionRule withOutputEntries(String[] outputEntries) {
        setOutputEntries(outputEntries);
        return this;
    }
}
