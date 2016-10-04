package com.eaccid.spring.web.controllers;

import com.eaccid.spring.web.dao.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @RequestMapping("/login")
    public String showLogin() {
        return "login";
    }

    @RequestMapping("/newaccount")
    public String showNewAccount(Model model) {
        model.addAttribute("user", new User());
        return "newaccount";
    }

    @RequestMapping("/createaccount")
    public String createAccount() {
        return "accountcreated";
    }



}