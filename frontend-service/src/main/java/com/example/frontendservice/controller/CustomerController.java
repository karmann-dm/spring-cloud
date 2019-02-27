package com.example.frontendservice.controller;

import com.example.frontendservice.intercomm.CustomerClient;
import com.example.frontendservice.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerClient customerClient;

    @GetMapping("")
    public ModelAndView customers() {
        ModelAndView modelAndView = new ModelAndView();
        List<Customer> customers = customerClient.findAll();
        modelAndView.addObject("customers", customers);
        modelAndView.setViewName("customer-list");
        return modelAndView;
    }

    @GetMapping("/{id}")
    public ModelAndView customer(@PathVariable("id") Integer id) {
        ModelAndView modelAndView = new ModelAndView();
        Customer customer = customerClient.findById(id);
        modelAndView.addObject("customer", customer);
        modelAndView.setViewName("customer");
        return modelAndView;
    }
}
