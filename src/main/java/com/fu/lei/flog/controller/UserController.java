package com.fu.lei.flog.controller;

import com.fu.lei.flog.dto.UserDto;
import com.fu.lei.flog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    public void Login(UserDto userDto){
        userService.check(userDto);
    }
}
