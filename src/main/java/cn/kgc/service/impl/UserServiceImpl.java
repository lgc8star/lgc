package cn.kgc.service.impl;

import cn.kgc.entity.User;
import cn.kgc.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author LiGuoCan
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private User user;

    @Override
    public User addUser() {
        return user;
    }
}
