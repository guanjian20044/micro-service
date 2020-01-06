package com.forezp.servicehi;

/**
 * Created by djjs on 2019-12-20.
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Value("${config.producer.instance:0}")
    private int instance;

    @RequestMapping("/")
    public String hello(@RequestParam String name) {
        return "[" + instance + "]" + "Hello, " + name + " " + new Date();

    }

}