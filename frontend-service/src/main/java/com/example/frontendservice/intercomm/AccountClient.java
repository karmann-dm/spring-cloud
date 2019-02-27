package com.example.frontendservice.intercomm;

import com.example.frontendservice.model.Account;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient("account-service")
public interface AccountClient {
    @RequestMapping(method = RequestMethod.GET, value = "/accounts/{number}")
    Account findByNumber(@PathVariable("number") String number);

    @RequestMapping(method = RequestMethod.GET, value = "/accounts/customer/{customer}")
    List<Account> findByCustomer(@PathVariable("customer") Integer customerId);

    @RequestMapping(method = RequestMethod.GET, value = "/accounts")
    List<Account> findAll();
}
