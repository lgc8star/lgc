package cn.kgc.controller;

import cn.kgc.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * HelloController
 * @author LiGuoCan
 */
@RestController
public class HelloController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "/hello")
    public String hello(){
        return "Hello SpringBoot";
    }

}
