package com.vurtne.controller;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.vurtne.common.annotation.UserLoginToken;
import com.vurtne.entity.Users;
import com.vurtne.service.IUsersService;

import com.vurtne.service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author vurtne
 * @since 2021-09-09
 */
@RestController
@RequestMapping("/user")
public class UsersController{
    @Autowired
    IUsersService iUsersService;

    @Autowired
    TokenService tokenService;

    @GetMapping("/index")
    public Object index() {
        return iUsersService.getById(1);
    }

    @PostMapping("/select")
    public Object testSelect(Integer id){
        return iUsersService.selectById(id);
    }

    @PostMapping("/insert")
    public Object testInsert(Users user) { return iUsersService.insertSelective(user);}

//    /**
//     * 登陆
//     * @param user
//     * @return
//     */
//    @PostMapping(value = "/login", produces = "application/json;charset=UTF-8")
//    public Object login(@RequestBody Users user) throws JSONException {
//        JSONObject jsonObject = new JSONObject();
//        Users userForBase = iUsersService.findUserById(Integer.valueOf(user.getId() + ""));
//        if(userForBase == null){
//            jsonObject.put("message","登陆失败，用户不存在");
//            return jsonObject;
//        }else{
//            if(!userForBase.getPassword().equals(user.getPassword())){
//                jsonObject.put("message","登陆失败，密码错误");
//                return jsonObject;
//            }else{
//                String token = tokenService.getToken(userForBase);
//                jsonObject.put("token", token);
//                jsonObject.put("user", userForBase);
//                return jsonObject;
//            }
//        }
//    }

//    @CrossOrigin
    @PostMapping(value = "/login", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public Object login(@RequestBody Users user){
        JSONObject jsonObject = new JSONObject();
        //尝试查找对应的user
        Users userForBase = iUsersService.findUserById(Integer.valueOf(user.getId() + ""));
        //查找失败
        if(userForBase == null) {
            jsonObject.put("message","登陆失败，用户不存在");
            return jsonObject;
        }else{
            //密码错误
            if(!userForBase.getPassword().equals(user.getPassword())){
                jsonObject.put("message","登陆失败，密码错误");
                return jsonObject;
            }else{
                //登陆成功
                String token = tokenService.getToken(userForBase);
                jsonObject.put("message","登陆成功");
                jsonObject.put("token", token);
                jsonObject.put("user", userForBase);
                return jsonObject;
            }
        }
    }

    @UserLoginToken
    @GetMapping("/getMessage")
    public String getMessage(){
        return "你已通过验证";
    }
}
