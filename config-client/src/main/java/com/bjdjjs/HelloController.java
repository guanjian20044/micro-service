package com.bjdjjs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * Created by djjs on 2020-1-6.
 * curl -X POST http://localhost:13000/actuator/refresh，返回 ["config.client.version","info.profile"]%
 */
@RestController
@RefreshScope
public class HelloController {
    @Value("${info.profile:error}")
    private String profile;

    @GetMapping("/info")
    public Mono<String> hello() {
        return Mono.justOrEmpty(profile);
    }
}
