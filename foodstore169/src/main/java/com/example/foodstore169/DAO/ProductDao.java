package com.example.foodstore169.DAO;

import com.example.foodstore169.Model.ProductModel;

import java.util.List;

public interface ProductDao {
    List<ProductModel> getProduct();

    List<ProductModel> getHomeProduct();


    ProductModel productEditData(String data);

    void productEditSave(ProductModel data);

    void productSave(ProductModel data);

    void productDelete(String id);
}
