package org.pei.provider;

import org.pei.common.model.User;
import org.pei.common.service.UserService;


public class UserServiceImpl implements UserService {
    public User getUser(User user) {
        System.out.println("用户名：" + user.getName());
        return user;
    }
}
