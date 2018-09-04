package com.stephen.pan.thymeleaf;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ThymeleafController {

    @RequestMapping("/thymeleaf")
    public ModelAndView index() {
        List<String> strList = new ArrayList<String>();
        strList.add("i am stephen123");
        strList.add("i am rick");
        strList.add("i am phil");
        strList.add("i am ellie");
        strList.add("i am bill");
        ModelAndView modelAndView = new ModelAndView("/index");
        modelAndView.addObject("strList", strList);
        return modelAndView;
    }

}
