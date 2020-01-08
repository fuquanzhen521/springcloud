package com.quanzhen.springcloud.controller;

import com.quanzhen.springcloud.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author fqz
 * @Date 2019.12.2
 */
@RestController
public class OrderController {

    @Autowired
    private RestTemplate restTemplate; //spring 提供的一个用于访问 rest 接口的模板对象

    @Value("${user.url}")
    private String url;

//    private String url = "http://localhost:7900/user/";  这样就把地址写死了，需要通过配置文件获取地址

    @GetMapping("/order/{id}")
    public User getOrder(@PathVariable Long id) {
        //访问提供者，获取数据
        User user = restTemplate.getForObject(url + id, User.class);  //通过访问rest 获取到 json 数据，然后转换为 user 对象
        return user;
    }
}
