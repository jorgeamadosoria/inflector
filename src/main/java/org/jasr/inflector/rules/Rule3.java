package org.jasr.inflector.rules;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class Rule3 implements Rule {

    Pattern             rule       = Pattern.compile(".*(b|c|d|f|g|h|j|k|l|m|n|ñ|p|q|r|s|t|v|w|x|y|z)y");

    Map<String, String> exceptions = new HashMap<String, String>();

    public Rule3() {
        
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.jasr.inflector.rules.Rule#apply(java.lang.String)
     */
    @Override
    public String apply(String singular) {
        if (doesApply(singular)) {
            if (exceptions.containsKey(singular))
                return exceptions.get(singular);

            return singular.substring(0, singular.lastIndexOf("y")) + "ies";
        }
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.jasr.inflector.rules.Rule#doesApply(java.lang.String)
     */
    @Override
    public boolean doesApply(String singular) {
        return rule.matcher(singular).matches();
    }
}
