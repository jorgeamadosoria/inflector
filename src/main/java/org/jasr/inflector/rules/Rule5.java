package org.jasr.inflector.rules;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class Rule5 implements Rule {
    Pattern             rule       = Pattern.compile(".*z");
    Map<String, String> exceptions = new HashMap<String, String>();

    public Rule5() {
        exceptions.put("kibutz", "kibutz");
    }

    /* (non-Javadoc)
     * @see org.jasr.inflector.rules.Rule#apply(java.lang.String)
     */
    @Override
    public String apply(String singular){
        if (doesApply(singular)){
            if (exceptions.containsKey(singular))
                return exceptions.get(singular);
           return singular.substring(0,singular.lastIndexOf("z")) + "ces";
        }
        return null;
    }

    /* (non-Javadoc)
     * @see org.jasr.inflector.rules.Rule#doesApply(java.lang.String)
     */
    @Override
    public boolean doesApply(String singular) {
        return rule.matcher(singular).matches();
    }
}
