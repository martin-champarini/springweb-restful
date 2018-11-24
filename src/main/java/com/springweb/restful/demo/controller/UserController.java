package com.springweb.restful.demo.controller;


import com.springweb.restful.demo.model.user.Datum;
import com.springweb.restful.demo.service.ApiServiceImp;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(value="user-example", description="Operations pertaining to users in this RestFul Example")
public class UserController {

    @Autowired
    private ApiServiceImp apiServiceImp;


    @GetMapping("getUsers")
    @ApiOperation(value = "retrieve a list of users from apiary.io")
    public List<Datum> getAllUsers(@RequestParam @ApiParam("Limit for User list") Integer limit) {
           return apiServiceImp.getUsers(limit);
    }
}
