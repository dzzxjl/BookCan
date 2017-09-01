package com.dzzxjl.repository;

import com.dzzxjl.domain.Book;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by dzzxjl on 2017/8/16.
 */
public interface BookRepository extends CrudRepository<Book, Long> {

    List<Book> findByTag(String tag);
    List<Book> findByUid(Long uid);
//    使用原生语句
//    @Query(value = "SELECT * FROM book WHERE status=0", nativeQuery = true)

    @Query("select bi from Book bi where bi.status = ?1")
    List<Book> findHasReadBook(int status);

}
