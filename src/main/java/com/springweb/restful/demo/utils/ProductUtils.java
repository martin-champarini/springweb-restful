package com.springweb.restful.demo.utils;

import com.springweb.restful.demo.model.product.optional.Product;
import com.springweb.restful.demo.model.product.optional.SubType_;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class ProductUtils {

    /*Return a field if exists, if not exists throw a message*/
    public String getUpdateBy(Product object) {
        Optional<Product> productOptional = Optional.of(object);
        return productOptional
                .map(Product::getInfo)
                .map(info -> info.get().getUpdateBy())
                .orElse("field missing");
    }

    /*return a object if exists if not exist throw emptyo object*/
    public SubType_ getLastSubType(Product product) throws Exception {
        Optional<Product> productOptional = Optional.of(product);

        return productOptional
                .map(Product::getResource)
                .map(resource -> resource.get().getSubType())
                .map(subType -> subType.get().getSubType())
                .map(Optional::get)
                .orElseGet(SubType_::new)
                ;
    }
}
