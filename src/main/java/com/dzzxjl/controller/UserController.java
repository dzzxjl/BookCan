package com.dzzxjl.controller;

import com.dzzxjl.domain.User;
import com.dzzxjl.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Iterator;
import java.util.List;

/**
 * Created by dzzxjl on 2017/8/21.
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserRepository userRepository;

    @RequestMapping("/login")
    public User login(HttpServletRequest request,
                      HttpServletResponse response,
                      String email, String password) {
        Cookie cookie = new Cookie("email","dzzxjl@126.com");
        //设置Maximum Age
        cookie.setMaxAge(1000);
        //设置cookie路径为当前项目路径
        cookie.setPath(request.getContextPath());
        response.addCookie(cookie);
//        response.addCookie(new Cookie("email","dzzxjl@126.com"));

        System.out.println(request.getCookies());
        System.out.println(request.getSession().getId());
//        request.getSession().setAttribute();
//        response.addCookie(new Cookie());
        Iterator<User> iterator = (Iterator<User>) this.userRepository.findAll().iterator();
        while (iterator.hasNext()) {
            User user = (User) iterator.next();
            if(user.getEmail().equals(email)) {
                if (user.getPassword().equals(password)) {
                    return user;
                }
            }
        }
        return null;

    }


}
