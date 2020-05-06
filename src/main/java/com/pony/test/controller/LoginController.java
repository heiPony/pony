package com.pony.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Controller
public class LoginController {


    @RequestMapping("/my-love")
    public String love(){
        return "/myLove";
    }
    @RequestMapping("/honey")
    public String honey(){
        return "/honey";
    }

    @RequestMapping("/han-bi")
    public String test(){
        return "/test";
    }






}
