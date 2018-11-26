package com.springweb.restful.demo.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import com.springweb.restful.demo.model.product.optional.Product;
import com.springweb.restful.demo.model.product.optional.SubType_;
import com.springweb.restful.demo.utils.ProductUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductUtils productUtils;
    private final ObjectMapper mapper = new ObjectMapper();

    /*Return a field if exists, if not exists throw a message*/
    public String getUpdateBy(Product product) {

        return productUtils.getUpdateBy(product);

    }

    /*return a object if exists if not exist throw emptyo object*/
    public SubType_ getLastSubType(Product product) throws Exception {
        return productUtils.getLastSubType(product);
    }

    /*return an string using registerModuce to include Optional fields on Pojos, also use without registerModule but not Optional*/
    public String processJson(String json) throws IOException {
        mapper.registerModule(new Jdk8Module());
        //com.springweb.restful.demo.model.product.Product product = mapper.readValue(json, com.springweb.restful.demo.model.product.Product.class);
        Product product = mapper.readValue(json, Product.class);

        return product.toString();
    }

}
