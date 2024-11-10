package com.infy.practice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/users")
public class EmployeeAPI {

    @GetMapping(value = "/api")
    public String myfun(){
        return "hello from the other side";
    }
}
