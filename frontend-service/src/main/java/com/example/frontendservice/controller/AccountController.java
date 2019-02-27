package com.example.frontendservice.controller;

import com.example.frontendservice.intercomm.AccountClient;
import com.example.frontendservice.intercomm.CustomerClient;
import com.example.frontendservice.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountClient accountClient;

    @GetMapping("")
    public ModelAndView accounts() {
        List<Account> accounts = accountClient.findAll();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("accounts", accounts);
        modelAndView.setViewName("account-list");
        return modelAndView;
    }

    @GetMapping("/{id}")
    public ModelAndView account(@PathVariable("id") Integer id) {
        List<Account> accounts = accountClient.findAll();
        ModelAndView modelAndView = new ModelAndView();
        Account account = accounts.stream().filter(a -> a.getId().equals(id)).findFirst().get();
        modelAndView.addObject("account", account);
        modelAndView.setViewName("account");
        return modelAndView;
    }
}
