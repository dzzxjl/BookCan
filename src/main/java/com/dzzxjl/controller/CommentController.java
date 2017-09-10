package com.dzzxjl.controller;

import com.dzzxjl.domain.Comment;
import com.dzzxjl.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dzzxjl on 2017/9/10.
 */
@RestController
public class CommentController {

    @Autowired
    CommentRepository commentRepository;

    @RequestMapping("/getComment")
    public List<Comment> getComment() {
        List<Comment> comments = new ArrayList<>();


        return this.commentRepository.findAll();
//        for (int i = 0; i < 10; i++) {
//            comments.add(new Comment("我是第" + i + "条评论" ));
//        }
//
//        return comments;
    }


    @RequestMapping("/addComment")
    public List<Comment> addComment(String comment) {
        Comment comment1 = new Comment(comment);
        this.commentRepository.save(comment1);
        return this.commentRepository.findAll();
    }


}
