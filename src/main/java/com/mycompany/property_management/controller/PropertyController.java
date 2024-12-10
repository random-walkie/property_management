package com.mycompany.property_management.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
@RequestMapping("/api/v1/properties")
public class PropertyController {

    // Annotation for mapping HTTP GET requests onto specific handler methods.
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello World";
    }
}
