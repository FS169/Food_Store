package com.example.foodstore169.DAO;

import com.example.foodstore169.Model.LoginModel;
import com.example.foodstore169.Model.UserModel;

import java.util.ArrayList;
import java.util.List;

public class LoginDataAccessService implements LoginDao{

    private static List<UserModel> DB = new ArrayList<>();
    private UserModel user;



    public boolean checkUser(LoginModel login) {
        return true;
    }
}
