package com.syoki.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.syoki.service.DemoService;

@Service
public class DemoServiceImpl implements DemoService {

    @Override
    public Integer add(Integer a, Integer b) {
        System.err.printf("方法add被调用 %s+%s", a, b);
        System.err.println();
        if(a==null||b==null){
            return 0;
        }
        return a+b;
    }
}
