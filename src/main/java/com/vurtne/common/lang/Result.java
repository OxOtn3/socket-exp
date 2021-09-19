package com.vurtne.common.lang;

import lombok.Data;

import javax.annotation.Resource;
import java.io.Serializable;

/**
 * @author oxotn3
 * @create 2021-09-09-12:46 下午
 */
@Data
public class Result implements Serializable {
    private String code;
    private String msg;
    private Object data;

    public static Result success(Object data){
        Result r = new Result();
        r.setCode("0");
        r.setData(data);
        r.setMsg("操作成功");
        return r;
    }

    public static Result success(String mes, Object data){
        Result r = new Result();
        r.setCode("0");
        r.setData(data);
        r.setMsg(mes);
        return r;
    }

    public static Result fail(String mes){
        Result r = new Result();
        r.setCode("400");
        r.setData(null);
        r.setMsg(mes);
        return r;
    }

    public static Result fail(String mes, Object data){
        Result r = new Result();
        r.setCode("400");
        r.setData(data);
        r.setMsg(mes);
        return r;
    }

}
