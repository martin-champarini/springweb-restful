package com.springweb.restful.demo.controller;


import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value="product-example", description="Operations pertaining to product in this RestFul Example")
public class ProductController {

    @GetMapping("/get-product")
    public String getProduct (){
        return "empty";
    }
}
