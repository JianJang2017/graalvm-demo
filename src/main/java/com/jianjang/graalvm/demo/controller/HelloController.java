package com.jianjang.graalvm.demo.controller;

import com.alibaba.fastjson2.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: graalvm-demo
 * @description: 测试类
 * @author: Jian Jang
 * @create: 2022-11-11 15:03:31
 */
@RestController
@RequestMapping
public class HelloController {
    /***
     * sayHello
     */
    @RequestMapping(value = "/sayHello", method = {RequestMethod.GET, RequestMethod.POST})
    public JSONObject sayHello(@RequestParam("name") String name) {
        JSONObject data = new JSONObject();
        data.put("code", "000000");
        data.put("message", "hello " + name);
        return data;
    }

}
