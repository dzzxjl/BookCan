package com.dzzxjl;

import com.dzzxjl.model.ConfiBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

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
