package com.dzzxjl.domain;

import javax.persistence.*;

/**
 * Created by dzzxjl on 2017/9/10.
 */
@Entity
public class Comment {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer cid;
    @Column
    private String content;



    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }



    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Comment(String content) {
        this.content = content;
    }

    public Comment() {

    }


}
