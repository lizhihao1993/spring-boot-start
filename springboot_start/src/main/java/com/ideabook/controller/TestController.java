package com.ideabook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: lzh
 * @Description:
 * @Date: Created in 2017/7/25 16:30
 */
@RestController
@RequestMapping("/start")
public class TestController {
    @RequestMapping("/demo")
    public String demo(){
        return "hello!!!!";
    }
}
