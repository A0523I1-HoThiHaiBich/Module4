package com.example.bt2_simple_dictionary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


@Controller
public class Dictionary {


    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/translate")
    public String translate(@RequestParam String keyword, String lang, Model model) {
        String result = "";
        boolean flag=false;
        String msg = "The keyword is not existed in dictionary";
        Map<String, String> dict = new HashMap<>();
        dict.put("hello", "xin chao");
        dict.put("cat", "meo");
        dict.put("dog", "cho");


        if (lang.equals("Eng")) {
            for (Map.Entry<String,String> entry : dict.entrySet()) {
                if (entry.getKey().equals(keyword)) {
                    result = entry.getValue();
                    flag=true;
                    break;
                }
            }
            if( flag==false) result=msg;
        }
        if (lang.equals("VN")) {
            for (Map.Entry<String,String> entry : dict.entrySet()) {
                if (entry.getValue().equals(keyword)) {
                    result = entry.getKey();
                    flag=true;
                    break;
                }
            }
            if( flag==false) result=msg;
        }
        model.addAttribute("result", result);
        return "index";
    }
}
