package com.example.bt1_simple_music.controller;

import com.example.bt1_simple_music.model.Songs;
import com.example.bt1_simple_music.service.ISongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("")
public class SongController {
    @Autowired
    private ISongService service;
    @GetMapping("/index")
    public String showList(Model model){
        List<Songs> songList= service.findAll();
        model.addAttribute("songList", songList);
        return "list";
    }
    @GetMapping("/showFormCreate")
    public String showFormCreate(Model model) {
        model.addAttribute("song", new Songs());
        return "create";
    }
    @PostMapping("/add")
    public String addNew(@ModelAttribute("customer") Songs song, RedirectAttributes redirectAttributes){
        service.save(song);
        redirectAttributes.addFlashAttribute("msg","Successful");
        return "redirect:/index";
    }
}
