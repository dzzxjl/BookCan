package com.dzzxjl.model;

/**
 * Created by dzzxjl on 2017/7/14.
 */
public class LearnResouce {
    private String author;
    private String name;
    private String website;

    public LearnResouce(String author, String name, String website) {
        this.author = author;
        this.name = name;
        this.website = website;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
}
