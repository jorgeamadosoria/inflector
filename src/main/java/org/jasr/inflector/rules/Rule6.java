package org.jasr.inflector.rules;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class Rule6 extends BaseRule {
    Pattern             rule       = Pattern.compile(".*(á|é|í|ó|ú)(s|x)");
    Map<String, String> exceptions = new HashMap<String, String>();

    public Rule6() {
    }

    /* (non-Javadoc)
     * @see org.jasr.inflector.rules.Rule#apply(java.lang.String)
     */
    @Override
    public String apply(String singular){
        if (doesApply(singular)){
            if (exceptions.containsKey(singular))
                return exceptions.get(singular);
            
/*           if (accented.contains(singular.charAt(singular.length()-2))){
               return singular.
           }
    */        
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
