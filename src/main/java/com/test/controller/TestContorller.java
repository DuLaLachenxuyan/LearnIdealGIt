package com.test.controller;

import com.test.bean.User;
import com.test.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Hao Chen
 * @version v1.0.0
 * @Package : com.test.controller
 * @Description : TODO
 * @Create on : 2020/3/5 0005 16:23
 **/
@RestController
public class TestContorller {

    @Autowired
    private UserMapper userMapper;

    /*
     * @description: test
     * @version: 1.0 <br>
     * @date: 2020/3/5 0005 16:24 <br>
     * @author: HaoChen <br>
     * @params：
     * @return: java.lang.String
     */
    @GetMapping("/test")
    public String test() {
        return "test";
    }
    @GetMapping("/getUserById")
    public User getUserById(Integer id) {
        return userMapper.getUserById(id);

    }
}
