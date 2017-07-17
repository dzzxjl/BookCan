package com.dzzxjl;

import com.dzzxjl.controller.LearnResourceController;
import com.dzzxjl.model.ConfiBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by dzzxjl on 2017/7/13.
 */
@SpringBootApplication
@EnableConfigurationProperties({ConfiBean.class})
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
