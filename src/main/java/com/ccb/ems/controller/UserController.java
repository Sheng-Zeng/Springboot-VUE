package com.ccb.ems.controller;

import com.ccb.ems.entity.User;
import com.ccb.ems.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * (User)表控制层
 *
 * @author makejava
 * @since 2020-06-17 11:12:31
 */
@RestController
@RequestMapping("user")
@ResponseBody
public class UserController {
    /**
     * 服务对象
     */
    @Autowired
    private UserService userService;

    @CrossOrigin
    @PostMapping("queryAll")
    public List<User> queryAll(@RequestBody User user){
        System.out.println(user);
        return this.userService.queryAll(user);
    }

    @GetMapping("getAll")
    public List<User> queryAll() {
        System.out.println("------getall------");
        return this.userService.queryAll(null);
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public User selectOne(String id) {
        return this.userService.queryById(id);
    }

    @RequestMapping("insertOne")
    public String insertOne(@RequestBody User user) {
        System.out.println(user);
        return this.userService.insert(user);
    }

}