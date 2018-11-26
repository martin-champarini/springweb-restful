package com.springweb.restful.demo.controller;


import com.springweb.restful.demo.model.product.optional.Product;
import com.springweb.restful.demo.model.product.optional.SubType_;
import com.springweb.restful.demo.service.ProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@Api(value="product-example", description="Operations pertaining to product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping(value = "/get-product")
    @ApiOperation(value = "return a user name  from updateBy field on the json", tags = "generic uses")
    public Product getProduct (@RequestBody Product product){
        return product;
    }

    @PostMapping(value = "/get-update-by")
    @ApiOperation(value = "return a user name  from updateBy field on the json", tags = "with Java 8 Optional")
    public String getUpdateBy(@RequestBody Product product) {
        return productService.getUpdateBy(product);
    }

    @PostMapping(value = "/get-subtype-last")
    @ApiOperation(value = "return the last subtype from json", tags = "with Java 8 Optional")
    public SubType_ getSubtype(@RequestBody Product product) throws Exception {

        System.out.println(productService.getLastSubType(product));
        return productService.getLastSubType(product);
    }

    @PostMapping(value = "/get-resource")
    @ApiOperation(value = "return resources from json, handled strings", tags = "generic uses")
    public String getResource(@RequestBody String json) throws IOException {
        return productService.processJson(json);
    }
}
