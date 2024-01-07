package org.example.controller;

import org.apache.dubbo.config.annotation.DubboReference;
import org.example.service.AuthService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    @DubboReference
    private AuthService authService;

    @GetMapping("/test/{name}")
    public String test(@PathVariable("name") String name){
        return authService.testStr(name);
    }
}
