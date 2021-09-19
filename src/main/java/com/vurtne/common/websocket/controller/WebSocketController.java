package com.vurtne.common.websocket.controller;

import com.vurtne.common.websocket.service.WebSocketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author oxotn3
 * @create 2021-09-19-3:17 下午
 */
@Controller
public class WebSocketController {

    @Autowired
    private WebSocketService webSocketService;

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/webSocket")
    public ModelAndView socket() {
        ModelAndView mav=new ModelAndView("/webSocket");
//        mav.addObject("userId", userId);
        return mav;
    }


}