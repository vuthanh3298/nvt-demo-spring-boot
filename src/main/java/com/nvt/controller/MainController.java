package com.nvt.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
 
@Controller
public class MainController {
    @GetMapping(value = {"/","/index"})
    public String login(Model model) {
        return "/login/index";
    }
    
    @GetMapping("/user-list")
    public String userList() {
        return "/user/list";
    }
    
    @GetMapping("/register")
    public String register() {
        return "/login/register";
    }
}
