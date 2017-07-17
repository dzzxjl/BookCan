package com.dzzxjl.controller;

import com.dzzxjl.model.ConfiBean;
import com.dzzxjl.model.Goodbye;
import com.dzzxjl.model.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by dzzxjl on 2017/7/13.
 */
@RestController
public class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    ConfiBean confiBean;


    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }

    @RequestMapping("/goodbye")
    public String goodBye( ) {
        return confiBean.getId() + confiBean.getName() + confiBean.getQq();
    }

}
