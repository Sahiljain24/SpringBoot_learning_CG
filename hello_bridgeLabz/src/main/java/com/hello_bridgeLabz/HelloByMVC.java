package com.hello_bridgeLabz;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloByMVC {

    @GetMapping("/web")
    public String greet(){
        return "hello";
    }
    @GetMapping("/web/message")
    public String greetMVC(Model model){
        model.addAttribute("name", "Bridgelabz");
        return "model";
    }
}
