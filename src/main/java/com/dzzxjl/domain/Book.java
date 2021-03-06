package com.dzzxjl.domain;

import org.hibernate.annotations.Generated;
import org.springframework.data.repository.cdi.Eager;
import org.springframework.stereotype.Controller;

import javax.persistence.*;

/**
 * Created by dzzxjl on 2017/8/16.
 */
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long bid;
    @Column(name = "name")
    private String name;
    @Column
    private String tag;
    @Column
    private int status;
    @Column
    private long uid;

    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }


    public Long getBid() {
        return bid;
    }

    public void setBid(Long bid) {
        this.bid = bid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
