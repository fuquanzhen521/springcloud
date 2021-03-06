package com.quanzhen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 主程序
 *
 * @author fqz
 * @Date 2019.12.2
 */
@SpringBootApplication
public class ConsumerOrder {

    @Bean   //相当于 xml 中的 bean 标签，主要用于调用当前方法获取到指定对象
    public RestTemplate getTemp() {
        return new RestTemplate();
    }

    public static void main(String args[]) {
        SpringApplication.run(ConsumerOrder.class);
    }
}
