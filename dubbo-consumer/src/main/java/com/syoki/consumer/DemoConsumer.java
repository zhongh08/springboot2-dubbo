package com.syoki.consumer;

import com.reger.dubbo.annotation.Inject;
import com.syoki.service.DemoService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DemoConsumer implements CommandLineRunner {

    // 使用兼容注入，可以使用dubbo原生注解@Reference注入
    @Inject
    DemoService service;

    @Override
    public void run(String... args) throws Exception {
        int a=1;
        int b =2;
        System.err.printf("%s+%s=%s", a, b, service.add(a,b));
        System.err.println();
    }
}
