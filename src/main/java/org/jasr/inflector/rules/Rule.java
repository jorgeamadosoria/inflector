package org.jasr.inflector.rules;

public interface Rule {

    String apply(String singular);

    boolean doesApply(String singular);

}
