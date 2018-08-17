package com.syoki;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DubboConsumerApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DubboConsumerApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.err.println("服务调用者------>>启动完毕");
    }
}
