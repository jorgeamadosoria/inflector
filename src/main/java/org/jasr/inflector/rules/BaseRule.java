package org.jasr.inflector.rules;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

public abstract class BaseRule implements Rule {

    protected Map<String, String> nonAccented = new HashMap<String, String>();
    protected Set<String>         accented    = new HashSet<String>();
    protected Map<String, String> exceptions  = new HashMap<String, String>();
    protected Pattern             rule;

    public BaseRule() {
        accented.add("á");
        accented.add("é");
        accented.add("í");
        accented.add("ó");
        accented.add("ú");
        nonAccented.put("á", "a");
        nonAccented.put("a", "a");
        nonAccented.put("b", "b");
        nonAccented.put("c", "c");
        nonAccented.put("d", "d");
        nonAccented.put("é", "e");
        nonAccented.put("e", "e");
        nonAccented.put("f", "f");
        nonAccented.put("g", "g");
        nonAccented.put("h", "h");
        nonAccented.put("í", "i");
        nonAccented.put("i", "i");
        nonAccented.put("j", "j");
        nonAccented.put("k", "k");
        nonAccented.put("l", "l");
        nonAccented.put("m", "m");
        nonAccented.put("n", "n");
        nonAccented.put("ñ", "ñ");
        nonAccented.put("ó", "o");
        nonAccented.put("o", "o");
        nonAccented.put("p", "p");
        nonAccented.put("q", "q");
        nonAccented.put("r", "r");
        nonAccented.put("s", "s");
        nonAccented.put("t", "t");
        nonAccented.put("ú", "u");
        nonAccented.put("u", "u");
        nonAccented.put("v", "v");
        nonAccented.put("w", "w");
        nonAccented.put("x", "x");
        nonAccented.put("y", "y");
        nonAccented.put("z", "z");
    }
    
    @Override
    public boolean doesApply(String singular) {
        return singular.length() > 1 && rule.matcher(singular).matches();
    }

}
