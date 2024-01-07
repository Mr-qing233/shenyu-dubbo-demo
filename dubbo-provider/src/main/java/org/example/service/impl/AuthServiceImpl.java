package org.example.service.impl;

import org.apache.dubbo.config.annotation.DubboService;
import org.example.service.AuthService;
import org.springframework.stereotype.Service;

@Service
@DubboService(registry = "nacos")
public class AuthServiceImpl implements AuthService {
    @Override
    public String testStr(String name) {
        return "this is" + name;
    }
}
