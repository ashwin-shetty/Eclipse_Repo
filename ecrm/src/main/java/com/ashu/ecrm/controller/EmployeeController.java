package com.ashu.ecrm.controller;

import org.springframework.web.bind.annotation.RestController;

import com.ashu.ecrm.model.Employee;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
public class EmployeeController {

  
    private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);
    
    @RequestMapping(value = "/employee", method = RequestMethod.POST)
    @ResponseBody
    public Employee updateCustomer(@RequestBody Employee employee) {
        logger.info("I am in the controller and got ID: " + employee.toString());
        return new Employee("Response ::"+employee.getFirstName(),"Response ::"+employee.getLastName(),"Response ::"+employee.getEmailId());
    }

}