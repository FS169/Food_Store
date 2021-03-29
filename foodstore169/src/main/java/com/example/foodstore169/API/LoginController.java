package com.example.foodstore169.API;

import com.example.foodstore169.Model.LoginModel;
import com.example.foodstore169.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/v1/user")
@RestController
public class LoginController {
     private final UserService userService;

     @Autowired
     public LoginController(UserService userService) {
         this.userService = userService;
     }

     public boolean checkUser(LoginModel login){return userService.checkUser(login);}

}
