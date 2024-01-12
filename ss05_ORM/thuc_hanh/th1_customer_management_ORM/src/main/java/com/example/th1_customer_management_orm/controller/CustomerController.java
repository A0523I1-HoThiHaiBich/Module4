package com.example.th1_customer_management_orm.controller;

import com.example.th1_customer_management_orm.model.Customer;
import com.example.th1_customer_management_orm.service.ICustomerService;
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
public class CustomerController {
    @Autowired
    private ICustomerService service;
    @GetMapping("/index")
    public String showList(Model model){
        List<Customer> customerList= service.findAll();
        model.addAttribute("customerList",customerList);
        return "list";
    }

    @GetMapping("/showFormCreate")
    public String showFormCreate(Model model) {
        model.addAttribute("customer", new Customer());
        return "create";
    }
    @PostMapping("/add")
    public String addNew(@ModelAttribute("customer") Customer customer, RedirectAttributes redirectAttributes){
        service.save(customer);
        redirectAttributes.addFlashAttribute("msg","Successful");
        return "redirect:/index";
        }


}
