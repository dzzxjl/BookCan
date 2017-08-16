package com.dzzxjl.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by dzzxjl on 2017/7/17.
 */
// indicating that it is a JPA entity
//For lack of a @Table annotation, it is assumed that this entity will be mapped to a table named Customer
@Entity
public class Song {
    @Id
    private int id;
    @Column
    private String name;
    @Column
    private String singer;

    public Song() {

    }
    public Song(int id, String name, String singer) {
        this.id = id;
        this.name = name;
        this.singer = singer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    @Override
    public String toString() {
        return "[id:" + id +  "; name:" + name + "; singer: " + singer  + "]";
    }
}
