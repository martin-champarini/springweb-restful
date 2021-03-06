
package com.springweb.restful.demo.model.product.optional;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

public class Detail implements Serializable
{

    private String price;
    private Integer limit;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 5926896744036563112L;

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Detail.class.getSimpleName() + "[", "]")
                .add("price='" + price + "'")
                .add("limit=" + limit)
                .add("additionalProperties=" + additionalProperties)
                .toString();
    }
}
