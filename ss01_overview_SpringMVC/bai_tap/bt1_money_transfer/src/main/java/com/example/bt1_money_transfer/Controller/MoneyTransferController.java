package com.example.bt1_money_transfer.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MoneyTransferController {
    @GetMapping("/index")
    public String index(){
        return "index";
    }
    @GetMapping("/transfer")
    public String transfer(@RequestParam int input, @RequestParam String currency, @RequestParam int rate, Model model){
        Double results=null;
        if( currency.equals("USD")){
            results= (double) (input*rate);
        }
        if( currency.equals("VND")){
            results= (double) (input/rate);
        }
        model.addAttribute("input",input);
        model.addAttribute("currency",currency);
        model.addAttribute("results",results);
        return "results";
    }
}
