
package com.springweb.restful.demo.model.product;

import java.io.Serializable;
import java.util.StringJoiner;

public class Product implements Serializable
{

    private Integer id;
    private String uuid;
    private String tag;
    private String status;
    private Resource resource;
    private Info info;
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

    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Product.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("uuid='" + uuid + "'")
                .add("tag='" + tag + "'")
                .add("status='" + status + "'")
                .add("resource=" + resource)
                .add("info=" + info)
                .toString();
    }
}
