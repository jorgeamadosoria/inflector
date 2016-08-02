package org.jasr.inflector.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;

@Entity
public class Noun {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long          id;
    private String        word;
    private boolean singular;
    
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getWord() {
        return word;
    }
    public void setWord(String word) {
        this.word = word;
    }
    public boolean isSingular() {
        return singular;
    }
    public void setSingular(boolean singular) {
        this.singular = singular;
    }
    

}
