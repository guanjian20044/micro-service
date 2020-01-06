package com.bjdjjs;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by djjs on 2019-12-23.
 */
@Component
public class HelloRemoteHystrix implements HelloRemote {


    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "系统忙，请稍后重试!";
    }
}
