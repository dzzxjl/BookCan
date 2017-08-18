package com.dzzxjl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import java.util.Iterator;

/**
 * Created by dzzxjl on 2017/7/13.
 */
@SpringBootApplication
//@EnableConfigurationProperties({ConfiBean.class})
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
