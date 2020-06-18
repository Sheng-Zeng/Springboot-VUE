package com.ccb.ems.service.impl;

import com.ccb.ems.entity.User;
import com.ccb.ems.dao.UserDao;
import com.ccb.ems.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

/**
 * (User)表服务实现类
 *
 * @author makejava
 * @since 2020-06-17 11:12:29
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public User queryById(String id) {
        return this.userDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<User> queryAllByLimit(int offset, int limit) {
            return this.userDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    @Override
    public String insert(User user) {
        user.setId(UUID.randomUUID().toString().replace("-", ""));
        if(this.userDao.insert(user) == 1) {
            return "SUCCESS";
        } else {
            return "ERROR";
        }
    }

    /**
     * 修改数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    @Override
    public User update(User user) {
        if (this.userDao.update(user) == 1){
            return this.queryById(user.getId());
        } else {
            return null;
        }

    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.userDao.deleteById(id) > 0;
    }

    @Override
    public List<User> queryAll(User user) {
        return this.userDao.queryAll(user);
    }
}