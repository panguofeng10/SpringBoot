package com.stephen.pan.actuator;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/getName")
    public String getName() {
        return "stephen";
    }

}
