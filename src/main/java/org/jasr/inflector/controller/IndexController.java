package org.jasr.inflector.controller;

import java.util.List;

import org.jasr.facundia.Facundia;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("features")
public class IndexController {

    private Facundia facundia = new Facundia();
    

    @RequestMapping("cardinal")
    public String cardinal(String number) {
        return facundia.cardinal(number);
    }
    
    @RequestMapping("inflection")
    public String inflect(String singular) {
        return facundia.inflectWord(singular);
    }
    
    @RequestMapping("syllabicate")
    public List<String> syllabicate(String word) {
        return facundia.syllabicate(word);
    }
}
