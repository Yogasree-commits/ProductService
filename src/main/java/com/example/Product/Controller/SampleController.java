package com.example.Product.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Products")
public class SampleController {
    @GetMapping("/hello/{name}")
    public String getHello(@PathVariable("name") String Name){
        return "Hello "+Name;
    }
}
