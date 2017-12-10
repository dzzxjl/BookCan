package com.dzzxjl.repository;

import com.dzzxjl.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

/**
 * Created by dzzxjl on 2017/9/10.
 */
public interface CommentRepository extends JpaRepository<Comment, Integer> {


}
