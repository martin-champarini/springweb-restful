
package com.springweb.restful.demo.model.product;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

public class Info implements Serializable
{

    private String updateBy;
    private String updateFrom;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 4956665303651001292L;

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public String getUpdateFrom() {
        return updateFrom;
    }

    public void setUpdateFrom(String updateFrom) {
        this.updateFrom = updateFrom;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Info.class.getSimpleName() + "[", "]")
                .add("updateBy='" + updateBy + "'")
                .add("updateFrom='" + updateFrom + "'")
                .add("additionalProperties=" + additionalProperties)
                .toString();
    }
}
