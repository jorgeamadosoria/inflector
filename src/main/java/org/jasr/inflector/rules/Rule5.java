package org.jasr.inflector.rules;

import java.util.regex.Pattern;

public class Rule5 extends BaseRule {

    public Rule5() {
        rule       = Pattern.compile(".*z");
        exceptions.put("kibutz", "kibutz");
        exceptions.put("diez", "diez");
        exceptions.put("arráez", "arraeces");
    }

    @Override
    public String apply(String singular){
        if (doesApply(singular)){
            if (exceptions.containsKey(singular))
                return exceptions.get(singular);
           return singular.substring(0,singular.lastIndexOf("z")) + "ces";
        }
        return null;
    }

}
