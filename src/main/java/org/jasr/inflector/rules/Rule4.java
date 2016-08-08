package org.jasr.inflector.rules;

import java.util.regex.Pattern;

public class Rule4 extends BaseRule {

    public Rule4() {
        rule = Pattern.compile(".*(d|j|l|r|n)");
        exceptions.put("espécimen", "especímenes");
        exceptions.put("régimen", "regímenes");
        exceptions.put("hipérbaton", "hipérbatos");
    }

    @Override
    public String apply(String singular) {
        if (doesApply(singular)) {
            if (exceptions.containsKey(singular))
                return exceptions.get(singular);

            if (singular.endsWith("ón"))
                return singular.substring(0, singular.lastIndexOf("ón")) + "ones";
            if (singular.endsWith("ín"))
                return singular.substring(0, singular.lastIndexOf("ín")) + "ines";
            if (singular.endsWith("én"))
                return singular.substring(0, singular.lastIndexOf("én")) + "enes";
            if (singular.endsWith("án"))
                return singular.substring(0, singular.lastIndexOf("án")) + "anes";
            return singular + "es";

        }
        return null;
    }

}
