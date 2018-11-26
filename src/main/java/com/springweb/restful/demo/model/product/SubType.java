
package com.springweb.restful.demo.model.product;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

public class SubType implements Serializable
{

    private Integer id;
    private String type;
    private SubType_ subType;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -2162499985942168514L;

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

    public SubType_ getSubType() {
        return subType;
    }

    public void setSubType(SubType_ subType) {
        this.subType = subType;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", SubType.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("type='" + type + "'")
                .add("subType=" + subType)
                .add("additionalProperties=" + additionalProperties)
                .toString();
    }
}
