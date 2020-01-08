package com.quanzhen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 主程序
 *
 * @author fqz
 * @Date 2019.12.2
 */
@SpringBootApplication
@EnableEurekaClient  //启用 eureka 客户端
public class ProviderUser {
    public static void main(String args[]) {
        SpringApplication.run(ProviderUser.class);
    }
}
