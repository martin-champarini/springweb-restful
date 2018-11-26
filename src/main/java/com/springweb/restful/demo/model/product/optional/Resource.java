
package com.springweb.restful.demo.model.product.optional;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.StringJoiner;

public class Resource implements Serializable
{

    private Integer id;
    private String type;
    private Optional<SubType> subType;
    private Detail detail;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 8888180525218492498L;

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

    public Optional<SubType> getSubType() {
        return subType;
    }

    public void setSubType(Optional<SubType> subType) {
        this.subType = subType;
    }

    public Detail getDetail() {
        return detail;
    }

    public void setDetail(Detail detail) {
        this.detail = detail;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Resource.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("type='" + type + "'")
                .add("subType=" + subType)
                .add("detail=" + detail)
                .add("additionalProperties=" + additionalProperties)
                .toString();
    }
}
