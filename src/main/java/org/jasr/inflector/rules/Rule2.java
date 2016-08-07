package org.jasr.inflector.rules;

public class Rule2 implements Rule {

    public Rule2() {
    }

    public String apply(String singular) {
        if (doesApply(singular)) {
            return singular + "es";
        }
        return null;
    }

    public boolean doesApply(String singular) {
        return singular.length() == 1;
    }

}
