package org.jasr.inflector.controller;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("pages")
public class NounController {

    @RequestMapping("index")
    public String index(Model model) throws Exception{
        
       
        
        
        
        return "index";
    }

}