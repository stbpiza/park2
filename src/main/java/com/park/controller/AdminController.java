package com.park.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
public class AdminController {

    @PostMapping("/api/start")
    public int start(HttpServletRequest request){
        HttpSession ss = request.getSession(true);
        ss.setMaxInactiveInterval(-1);
        ss.setAttribute("timePrice",2000);
        ss.setAttribute("regPrice",50000);
        ss.setAttribute("change",100000);
        return 1;
    }
}
