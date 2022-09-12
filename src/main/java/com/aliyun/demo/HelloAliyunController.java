package com.aliyun.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.apache.commons.logging.Log;

@RestController
public class HelloAliyunController {

    @RequestMapping("/")
    public String fowardIndex() {
        return "index";
    }

}

