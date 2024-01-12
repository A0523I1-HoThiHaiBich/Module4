package com.example.th1_validate_email_gradle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Controller
public class ValidateEmail {
    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

    @RequestMapping("/index")
    public String index(){
        return "index";
    }
    @GetMapping("/validate")
    public String validate(@RequestParam String email, Model model){

        String result= "";
        String successMsg="Email is validated";
        String failedMsg="Email is not validated";
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(email);
        if(matcher.matches()){
            result=successMsg;
        }else  result=failedMsg;

        model.addAttribute("result",result);
        return"index";
    }

}
