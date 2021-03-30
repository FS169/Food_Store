package com.example.foodstore169.API;

import com.example.foodstore169.Model.ProductModel;
import com.example.foodstore169.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductController {

    private UserService userService;

    public ProductController(UserService userService) {
        this.userService = userService;
    }

    @Autowired
    public void SignupController(UserService userService) {
        this.userService = userService;
    }
    List<ProductModel> getProduct()
    {

    }

    List<ProductModel> getHomeProduct()
    {

    }

    ProductModel productEditData(String data)
    {

    }

    void productEditSave(ProductModel data)
    {

    }

    void productSave(ProductModel data)
    {

    }

    void productDelete(String id)
    {

    }
}
