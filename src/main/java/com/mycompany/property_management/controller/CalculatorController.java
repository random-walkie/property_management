package com.mycompany.property_management.controller;

import com.mycompany.property_management.dto.CalculatorDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/*
We can annotate classic controllers with the @Controller annotation. This is simply a specialization of the @Component
class, which allows us to auto-detect implementation classes through the classpath scanning.
We typically use @Controller in combination with a @RequestMapping annotation for request handling methods.
@RestController is a specialized version of the controller. It includes the @Controller and @ResponseBody annotations,
and as a result, simplifies the controller implementation.
 */
@RestController
/*
You can use the @RequestMapping annotation to map requests to controllers methods. It has various attributes to match
by URL, HTTP method, request parameters, headers, and media types. You can use it at the class level to express shared
 mappings or at the method level to narrow down to a specific endpoint mapping.
 */
@RequestMapping("/api/v1/calculator")
public class CalculatorController {

    // Annotation for mapping HTTP GET requests onto specific handler methods.
    @GetMapping("/add")
    /*
     http://localhost:8080/api/v1/calculator/add
     http://localhost:8080/api/v1/calculator/add?num111=6.7&num222=1.3 -> due to @RequestParam
     You can use the @RequestParam annotation to bind Servlet request parameters (that is, query parameters or form data)
     to a method argument in a controller.
     */
    public Double add(@RequestParam("num1") Double num1, @RequestParam("num2") Double num2) {
        return num1 + num2;
    }

    /*
    @PathVariable: Annotation which indicates that a method parameter should be bound to a URI template variable.
    Supported for RequestMapping annotated handler methods.
     */
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

    /*
     POST is used to send data to a server to create/update a resource.
     @PostMapping: Annotation for mapping HTTP POST requests onto specific handler methods.
     @RequestBody: Annotation used to have the request body read and deserialized into an Object through an HttpMessageConverter.
     */
    @PostMapping("/multiply")
    public ResponseEntity<Double> multiply(@RequestBody CalculatorDTO calculatorDTO){
        Double result = null;
        result = calculatorDTO.getNum1() * calculatorDTO.getNum2() * calculatorDTO.getNum3() * calculatorDTO.getNum4();
        return new ResponseEntity<Double>(result, HttpStatus.CREATED);
        // Now a client is receiving the data and status of HTTP request.
    }
}
