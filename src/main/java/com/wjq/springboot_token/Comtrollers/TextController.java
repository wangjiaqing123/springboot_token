package com.wjq.springboot_token.Comtrollers;


import com.wjq.springboot_token.util.JwtUtil;
import com.wjq.springboot_token.util.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestController
public class TextController {
    @GetMapping("/wangjiaqing/hello")
    public String hello(){
        return "hello world";
    }
    @GetMapping("/wjq/login")
    public Result login(String username, String pass){
        String userId = UUID.randomUUID().toString();
//        指在一台机器上生成的数字，它保证对在同一时空中的所有机器都是唯一的
        //生成UUID，作为用户ID


        //自定义数据
        Map<String,Object> info = new HashMap<>();
        info.put("username","tom");
        info.put("pass","admin");


        String token = JwtUtil.sign(userId, info);
        return Result.success("token:" + token);


    }
}
