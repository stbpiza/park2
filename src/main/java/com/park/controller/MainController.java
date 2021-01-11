package com.park.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/")
    public String index() {
        return "start";
    }

    @RequestMapping("/gate")
    public String gate() {
        return "gate";
    }

    @RequestMapping("/welcome")
    public String welcome() {
        return "welcome";
    }

    @RequestMapping("/bye")
    public String bye() {
        return "bye";
    }

    @RequestMapping("/admin")
    public String admin() { return "admin"; }
}
