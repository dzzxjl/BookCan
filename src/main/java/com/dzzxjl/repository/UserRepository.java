package com.dzzxjl.repository;

import com.dzzxjl.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by dzzxjl on 2017/8/21.
 */
public interface UserRepository extends JpaRepository<User, Long> {

}
