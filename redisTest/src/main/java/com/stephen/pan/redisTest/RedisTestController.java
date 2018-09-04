package com.stephen.pan.redisTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisTestController {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate redisTemplate;

    @RequestMapping("/redisTest/add")
    public String add() {
        String name = "stephen";
        stringRedisTemplate.opsForValue().set("myName", "stephen");
        return "add name '"+name+"' success";
    }

    @RequestMapping("/redisTest/print")
    public String print() {
        String myName = stringRedisTemplate.opsForValue().get("myName");
        return "print success, my name is '" + myName + "'";
    }

    @RequestMapping("/redisTest/delete")
    public String delete() {
        stringRedisTemplate.delete("myName");
        return "delete name success";
    }

}
