package ru.otus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/public")
    public String publicPage(){
        return "public_1";
    }

    @GetMapping("/ads")
    public String adsPage(){
        return "ads";
    }

    public Integer retryCount(){
        return 7;
    }

    public void newMethod1(){
        //
    }
}
