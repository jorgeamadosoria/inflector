package org.jasr.inflector.rules;

import java.util.regex.Pattern;

public class Rule7 extends BaseRule {

    public Rule7() {
        rule = Pattern.compile(".*(b|c|d|f|g|h|j|k|l|m|n|ñ|p|q|r|s|t|v|w|x|y|z)(s|x)");
        exceptions.put("lats", "lati");
        exceptions.put("santims", "santimi");
    }

    @Override
    public String apply(String singular) {
        if (doesApply(singular)) {
            if (exceptions.containsKey(singular))
                return exceptions.get(singular);

            return singular + "s";
        }
        return null;
    }

}
