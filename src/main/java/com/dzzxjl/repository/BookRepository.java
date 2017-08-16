package com.dzzxjl.repository;

import com.dzzxjl.domain.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by dzzxjl on 2017/8/16.
 */
public interface BookRepository extends CrudRepository<Book, Long> {

}
