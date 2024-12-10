package com.mycompany.property_management.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/calculator")
public class CalculatorController {

    @GetMapping("/add")
    // http://localhost:8080/api/v1/calculator/add
    // http://localhost:8080/api/v1/calculator/add?num111=6.7&num222=1.3 -> due to @RequestParam
    public Double add(@RequestParam("num1") Double num1, @RequestParam("num2") Double num2) {
        return num1 + num2;
    }

    // In this example, we will map the values of url to Java variables by Path Variable method.
    @GetMapping("/subtract/{num1}/{num2}")
    public Double subtract(@PathVariable("num1") Double num1, @PathVariable("num2") Double num2) {
        Double result = null;
        if (num1 > num2) {
            result = num1 - num2;
        } else {
            result = num2 - num1;
        }
        return result;
    }
}
