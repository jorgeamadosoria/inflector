package org.jasr.inflector.rules;

import java.util.regex.Pattern;

public class Rule1 extends BaseRule {

    public Rule1() {
        rule       = Pattern.compile(".*(a|e|i|o|u|á|í|ú|ó|é|b|c|f|g|h|k|m|ñ|p|q|t|v|w)");
        exceptions.put("acarpo", "acarpa");
        exceptions.put("afro", "afro");
        exceptions.put("basoto", "basoto");
        exceptions.put("doce", "doce");
        exceptions.put("trece", "trece");
        exceptions.put("catorce", "catorce");
        exceptions.put("quince", "quince");
        exceptions.put("diecisiete", "diecisiete");
        exceptions.put("dieciocho", "dieciocho");
        exceptions.put("diecinueve", "diecinueve");
        exceptions.put("lao", "lao");
        exceptions.put("noúmeno", "noumena");
        exceptions.put("no", "noes");
        exceptions.put("cu", "cúes");
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

}
