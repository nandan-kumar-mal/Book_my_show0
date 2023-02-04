package com.nandan.BookMyShowBackend0.Controllers;

import com.nandan.BookMyShowBackend0.Dtos.UserRequestDto;
import com.nandan.BookMyShowBackend0.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;
    @PostMapping("/add")
    public String addUser(@RequestBody UserRequestDto userRequestDto){

        return userService.createUser(userRequestDto);

    }


}
