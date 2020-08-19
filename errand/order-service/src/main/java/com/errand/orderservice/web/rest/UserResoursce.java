package com.errand.orderservice.web.rest;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Api(description = "用户管理", tags = "UserController")
@RestController
@RequestMapping("/user")
public class UserResoursce {

    private Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @ApiOperation("添加用户")
    @PostMapping("/create")
    public String create() {

        return "操作成功";
    }
}
