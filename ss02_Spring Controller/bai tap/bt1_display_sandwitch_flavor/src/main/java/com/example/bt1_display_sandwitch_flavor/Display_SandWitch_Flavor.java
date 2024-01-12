package com.example.bt1_display_sandwitch_flavor;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Display_SandWitch_Flavor {
    @GetMapping("/index")
    public String index(){
        return "index";
    }
    @GetMapping("/display")

   public String display(Model model, @RequestParam String[] flavor){
        model.addAttribute("list", flavor);
        return "showList";
    }
}
