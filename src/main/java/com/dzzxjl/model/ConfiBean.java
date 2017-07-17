package com.dzzxjl.model;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by dzzxjl on 2017/7/14.
 */
@ConfigurationProperties(prefix = "com.dzzxjl")
public class ConfiBean {
    private String name;
    private String id;
    private String qq;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }
}
