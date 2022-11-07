package com.jm.controller;

import com.fasterxml.jackson.databind.JsonSerializable;
import com.jm.vo.Student;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class RedisController {

    /**
     * 注入StringRedisTemplate
     */
    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @Resource
    private RedisTemplate redisTemplate;

    //添加数据到redis
    @PostMapping("/redis/addString")
    public String addToRedis(String key,String value){
        //添加数据到redis
        stringRedisTemplate.opsForValue().set(key,value);
        return "向redis中添加string类型数据";
    }

    //从redis获取数据
    @GetMapping("/redis/getKey")
    public String getData(String key){
        String myname = stringRedisTemplate.opsForValue().get(key);
        return "key是="+key+",值="+myname;
    }

    @RequestMapping("/redis/addjson")
    public String addJson(){
        Student student=new Student();
        student.setId(1001);
        student.setName("lisi");
        student.setAge(22);

        redisTemplate.setKeySerializer(new StringRedisSerializer());
        //把值作为json序列化
        redisTemplate.setValueSerializer(new Jackson2JsonRedisSerializer<>(Student.class));

        redisTemplate.opsForValue().set("mystudent",student);

        return "json序列化";
    }

    @RequestMapping("/redis/getjson")
    public String getJson(){

        redisTemplate.setKeySerializer(new StringRedisSerializer());
        //把值作为json序列化
        redisTemplate.setValueSerializer(new Jackson2JsonRedisSerializer<>(Student.class));

        Object obj = redisTemplate.opsForValue().get("mystudent");

        return "json反序列化"+obj;
    }
}
