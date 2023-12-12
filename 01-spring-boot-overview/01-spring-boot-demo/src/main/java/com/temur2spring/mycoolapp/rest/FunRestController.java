package com.temur2spring.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
public class FunRestController {
    // expose "/" that return "Hello Temur"

        @GetMapping("/")
        public String sayHelloTemur(){
            return "Hello World";
        }
}
