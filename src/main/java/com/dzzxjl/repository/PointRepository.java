package com.dzzxjl.repository;

import com.dzzxjl.domain.Point;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import java.util.List;

/**
 * Created by dzzxjl on 2017/8/15.
 */
public interface PointRepository extends CrudRepository<Point, Long> {

}
