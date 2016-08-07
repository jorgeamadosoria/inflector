package org.jasr.inflector.rules;

import java.util.regex.Pattern;

public class Rule1 extends BaseRule {
    Pattern             rule       = Pattern.compile(".*(a|e|i|o|u|á|í|ú|ó|é|b|c|f|g|h|k|m|ñ|p|q|t|v|w)");
    

    public Rule1() {
        exceptions.put("acarpo", "acarpa");
        exceptions.put("afro", "afro");
        exceptions.put("basoto", "basoto");
        exceptions.put("dieciocho", "dieciocho");
        exceptions.put("lao", "lao");
        exceptions.put("noúmeno", "noumena");
        exceptions.put("no", "noes");
        exceptions.put("o", "oes");
        exceptions.put("sí", "síes");
        exceptions.put("platino", "platino");
        exceptions.put("porno", "porno");
        exceptions.put("tauro", "tauro");
        exceptions.put("mambí", "mambises");
        exceptions.put("mambí", "mambises");
        exceptions.put("sándwich", "sándwiches");
        exceptions.put("maquech", "maqueches");
        exceptions.put("imam", "imames");
        exceptions.put("álbum", "álbumes");
        exceptions.put("carácter", "caracteres");
        
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

            if (singular.endsWith("st"))
                return singular;
            if (singular.endsWith("club"))
                return singular + "es";

            return singular + "s";
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
