
package com.springweb.restful.demo.model.product.optional;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Product implements Serializable
{

    private Integer id;
    private String uuid;
    private String tag;
    private String status;
    private Optional<Resource> resource;
    private Optional<Info> info;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 655806359845066882L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Optional<Resource> getResource() {
        return resource;
    }

    public void setResource(Optional<Resource> resource) {
        this.resource = resource;
    }

    public Optional<Info> getInfo() {
        return info;
    }

    public void setInfo(Optional<Info> info) {
        this.info = info;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
