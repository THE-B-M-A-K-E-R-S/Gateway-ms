package com.thebmakes.gateway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@CrossOrigin("*")
public class Controller {
    @Autowired
    private Environment environment;

    @GetMapping("/health")
    public HashMap<String,String> health() {
        return new HashMap<String,String>() {{
            put("message", "Gateway is up and running on port: " + environment.getProperty("local.server.port") +" ☕🍵");
        }};
    }
}
