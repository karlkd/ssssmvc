package com.wlqq.he.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Created by 69412 on 2018/3/1.
 */
@Controller
@RequestMapping("/home")
public class HellowController {
    //添加一个日志器
    private static final Logger logger = LoggerFactory.getLogger(HellowController.class);

    //映射一个action
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public  String index(){
        //输出日志文件
        logger.info("the first jsp pages");
        //返回一个index.jsp这个视图
        return "index";
    }
}

