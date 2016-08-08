package org.jasr.inflector.rules;

import java.util.regex.Pattern;

public class Rule6 extends BaseRule {

    public Rule6() {
        rule       = Pattern.compile(".*(a|e|i|o|u)(s|x)");
    }

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

}
