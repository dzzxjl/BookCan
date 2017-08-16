package com.dzzxjl.controller;

import com.dzzxjl.domain.Point;
import com.dzzxjl.repository.PointRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dzzxjl on 2017/8/15.
 */
@RestController
public class PointController {
    @Autowired
    PointRepository pointRepository;

    @RequestMapping("/point")
    public int getPointCount() {
        return (int) this.pointRepository.count();
    }
    @RequestMapping("/allpoint")
    public Point getPoint() {
        Point point = (Point) this.pointRepository.findOne(502L);
        System.out.println(point);
        return point;
    }



}
