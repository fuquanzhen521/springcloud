package com.quanzhen.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 主程序类
 *
 * @author fqz
 * @Date 2019.12.3
 */
@SpringBootApplication
@EnableEurekaServer   //将当前项目标记为eurekaserver
public class EurekaApp {

    public static void main(String args[]) {
        SpringApplication.run(EurekaApp.class);
    }

}
