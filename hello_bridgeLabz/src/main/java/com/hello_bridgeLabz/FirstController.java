package com.hello_bridgeLabz;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping("/hello")
    public String greetHello(){
       return "HELlo From BridgeLabz";
    }
}
