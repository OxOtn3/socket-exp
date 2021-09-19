package com.vurtne.service.impl;

import com.vurtne.entity.Users;
import com.vurtne.mapper.UsersMapper;
import com.vurtne.service.IUsersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.vurtne.service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author vurtne
 * @since 2021-09-09
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements IUsersService {

    @Autowired
    UsersMapper usersMapper;

    TokenService tokenService;

    @Override
    public Users selectById(Integer id) {
        return usersMapper.selectById(id);
    }

    @Override
    public int insertSelective(Users user) {
        usersMapper.insert(user);
        return 1;
    }

    @Override
    public Users findUserById(Integer id) {
        return usersMapper.selectById(id);
    }

}
