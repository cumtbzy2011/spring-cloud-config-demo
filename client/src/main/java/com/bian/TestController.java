package com.bian;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Mr.Bi on 2017/6/3.
 */
@RestController
@RefreshScope
public class TestController {

    //修改过git上的配置文件后，访问localhost:8080/refresh会刷新此值
    @Value("${testkey}")
    String testValue;

    @RequestMapping("testKey")
    public String getKey() {
        return testValue;
    }
}
