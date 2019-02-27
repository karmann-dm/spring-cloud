package com.example.frontendservice.intercomm;

import com.example.frontendservice.model.Customer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient("customer-service")
public interface CustomerClient {
    @RequestMapping(method = RequestMethod.GET, value = "/customers/pesel/{pesel}")
    Customer findByPesel(@PathVariable("pesel") String pesel);

    @RequestMapping(method = RequestMethod.GET, value = "/customers")
    List<Customer> findAll();

    @RequestMapping(method = RequestMethod.GET, value = "/customers/{id}")
    Customer findById(@PathVariable("id") Integer id);
}
