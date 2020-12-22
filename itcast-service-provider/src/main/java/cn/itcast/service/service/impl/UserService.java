package cn.itcast.service.service.impl;

import cn.itcast.service.mapper.UserMapper;
import cn.itcast.service.pojo.User;
import cn.itcast.service.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserMapper userMapper;

    public User findById(Integer id){
        User user = userMapper.findById(id);
        return user;
    }
}
