package org.jasr.inflector.rules;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class Rule4 implements Rule {
    Pattern             rule       = Pattern.compile(".*n");
    Map<String, String> exceptions = new HashMap<String, String>();

    public Rule4() {
             
        exceptions.put("espécimen", "especímenes");
        exceptions.put("régimen", "regímenes");
        exceptions.put("hipérbaton", "hipérbatos");
    }

    /* (non-Javadoc)
     * @see org.jasr.inflector.rules.Rule#apply(java.lang.String)
     */
    @Override
    public String apply(String singular){
        if (doesApply(singular)){
            if (exceptions.containsKey(singular))
                return exceptions.get(singular);
           return singular.substring(0,singular.lastIndexOf("ón")) + "ones";
           
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
