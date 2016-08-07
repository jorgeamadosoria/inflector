package org.jasr.inflector.rules;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class Rule8 implements Rule {

    Pattern             rule       = Pattern.compile(".*(a|e|i|o|u)y");
    Map<String, String> exceptions = new HashMap<String, String>();

    public Rule8() {
       // exceptions.put(key, value)
    }

    /* (non-Javadoc)
     * @see org.jasr.inflector.rules.Rule#apply(java.lang.String)
     */
    @Override
    public String apply(String singular){
        if (doesApply(singular)){
            if (exceptions.containsKey(singular))
                return exceptions.get(singular);
            
           return singular + "es";
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
