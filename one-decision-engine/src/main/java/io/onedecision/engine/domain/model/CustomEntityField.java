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
package io.onedecision.engine.domain.model;

public class CustomEntityField extends EntityField {

    public CustomEntityField(String name, String label, String hint,
            boolean required, String type) {
        super(name, label, hint, required, type);
        setBuiltIn(false);
    }

    public CustomEntityField(String name, String label, String hint,
            boolean required, String type, String validation) {
        super(name, label, hint, required, type, validation);
        setBuiltIn(false);
    }
}
