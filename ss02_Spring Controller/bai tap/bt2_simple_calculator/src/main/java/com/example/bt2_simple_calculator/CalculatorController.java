package com.example.bt2_simple_calculator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    @RequestMapping("index")
    public String index(){
        return "index";
    }
    @GetMapping("/calculate")
    public String calculate(Model model, @RequestParam int firstNum, int secondNum, String function){
        int result=0;
        if (function.equals("add")){
            result=firstNum+secondNum;

        }if (function.equals("sub")){
            result=firstNum-secondNum;

        }
        if (function.equals("multi")){
            result=firstNum*secondNum;

        }
        if (function.equals("div")){
            result=firstNum/secondNum;

        }
        model.addAttribute("result",result);
        model.addAttribute("firstNum",firstNum);
        model.addAttribute("secondNum",secondNum);
        return "index";

    }
}
