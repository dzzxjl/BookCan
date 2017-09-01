package com.dzzxjl.controller;

import com.dzzxjl.domain.Book;
import com.dzzxjl.domain.User;
import com.dzzxjl.repository.BookRepository;
import com.dzzxjl.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
    @Autowired
    BookRepository bookRepository;

    // 接收post请求
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public void temp() {
        System.out.println("get请求");
    }
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    // 返回书罐信息
    public List<Book> login(HttpServletRequest request,
                      HttpServletResponse response,
                      String email, String password) {

        System.out.println("数据" + request.getParameter("email"));
        Cookie cookie = new Cookie("email","dzzxjl126.com");
        response.addCookie(cookie);
        response.addCookie(new Cookie("xingbie", "nan"));
        System.out.println(request.getSession().getId());
        Iterator<User> iterator = (Iterator<User>) this.userRepository.findAll().iterator();
        while (iterator.hasNext()) {
            User user = (User) iterator.next();
            if(user.getEmail().equals(email)) {
                if (user.getPassword().equals(password)) {
                    return this.bookRepository.findByUid(user.getUid());
                }
            }
        }
        return null;

    }
    // 返回用户信息
//    public User login(HttpServletRequest request,
//                      HttpServletResponse response,
//                      String email, String password) {
//
//        System.out.println("数据" + request.getParameter("email"));
//        Cookie cookie = new Cookie("email","dzzxjl126.com");
//        response.addCookie(cookie);
//        response.addCookie(new Cookie("xingbie", "nan"));
//        System.out.println(request.getSession().getId());
//        Iterator<User> iterator = (Iterator<User>) this.userRepository.findAll().iterator();
//        while (iterator.hasNext()) {
//            User user = (User) iterator.next();
//            if(user.getEmail().equals(email)) {
//                if (user.getPassword().equals(password)) {
//                    return user;
//                }
//            }
//        }
//        return null;
//
//    }


}
