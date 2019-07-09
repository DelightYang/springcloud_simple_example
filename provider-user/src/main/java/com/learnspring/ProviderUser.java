package com.learnspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Provider-User执行文件
 * 设为Provider-User的主程序
 */
@SpringBootApplication
public class ProviderUser {

    public static void main(String[] args) {
        SpringApplication.run(ProviderUser.class);
        System.out.println("Hello World!");
    }
}
