package org.jasr.inflector.rules;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class Rule7 implements Rule {
    Pattern             rule       = Pattern.compile(".*(á|é|í|ó|ú)(s|x)");
    Map<String, String> exceptions = new HashMap<String, String>();

    public Rule7() {
    }

    /* (non-Javadoc)
     * @see org.jasr.inflector.rules.Rule#apply(java.lang.String)
     */
    @Override
    public String apply(String singular){
        if (doesApply(singular)){
            if (exceptions.containsKey(singular))
                return exceptions.get(singular);
           return singular;
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
