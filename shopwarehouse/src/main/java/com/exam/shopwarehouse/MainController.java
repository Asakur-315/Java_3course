package com.exam.shopwarehouse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String mainPAGE(){
        return "greeting";
    }
}
