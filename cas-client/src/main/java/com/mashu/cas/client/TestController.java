package com.mashu.cas.client;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mashu
 * Date 2020/10/17 16:33
 */
@RestController
public class TestController {

    @RequestMapping("/hello")
    public String hello() {
        return "word";
    }
}
