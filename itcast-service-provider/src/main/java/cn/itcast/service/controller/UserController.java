package cn.itcast.service.controller;

import cn.itcast.service.pojo.User;
import cn.itcast.service.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("/findById/{id}")
    public User findById(@PathVariable("id") Integer id){
        User user = userService.findById(id);
        return user;
    }
}
