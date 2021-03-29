package com.example.foodstore169.DAO;

import com.example.foodstore169.Model.ProductModel;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class ProductAccessService implements ProductDao {



    @Override
    @GetMapping
    public List<ProductModel> getProduct() {
        return null;
    }

    @Override
    public List<ProductModel> getHomeProduct() {
        return null;
    }

    @Override
    public ProductModel productEditData(String data) {
        return null;
    }

    @Override
    public void productEditSave(ProductModel data) {

    }

    @Override
    public void productSave(ProductModel data) {

    }

    @Override
    public void productDelete(String id) {

    }
}
