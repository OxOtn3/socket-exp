package com.vurtne.service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.vurtne.entity.Users;
import org.springframework.stereotype.Service;

/**
 * @author oxotn3
 * @create 2021-09-17-1:22 下午
 */
@Service
public class TokenService {

    public String getToken(Users user) {
        String token="";
        token= JWT.create().withAudience(user.getId().toString())
                .sign(Algorithm.HMAC256(user.getPassword()));
        return token;
    }
}
