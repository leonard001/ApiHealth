package com.ApiHealth.Health;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class holaMundo {

    @RequestMapping("/hola")
    public String hola(){
        return "Hola leonard";
    }
}
