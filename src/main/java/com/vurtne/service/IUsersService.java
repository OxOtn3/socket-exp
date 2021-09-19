package com.vurtne.service;

import com.vurtne.entity.Users;
import com.baomidou.mybatisplus.extension.service.IService;

import java.io.Serializable;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author vurtne
 * @since 2021-09-09
 */
public interface IUsersService extends IService<Users> {

    public Users selectById(Integer id);

    public int insertSelective(Users user);

    public Users findUserById(Integer id);


}
