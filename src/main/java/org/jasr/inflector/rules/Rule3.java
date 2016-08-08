package org.jasr.inflector.rules;

import java.util.regex.Pattern;

public class Rule3 extends BaseRule {

    public Rule3() {
        rule = Pattern.compile(".*(b|c|d|f|g|h|j|k|l|m|n|ñ|p|q|r|s|t|v|w|x|y|z)y");
        exceptions.put("ferry", "ferris");
        exceptions.put("lobby", "lobbies");
        exceptions.put("proxy", "proxies");
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
