
package com.springweb.restful.demo.model.product.optional;

import java.io.Serializable;
import java.util.StringJoiner;

public class SubType_ implements Serializable
{

    private Integer id;
    private String type;
    private final static long serialVersionUID = -3521323264851477688L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", SubType_.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("type='" + type + "'")
                .toString();
    }
}
