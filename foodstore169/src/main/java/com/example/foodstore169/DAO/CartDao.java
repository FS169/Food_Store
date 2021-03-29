package com.example.foodstore169.DAO;

import java.util.List;

public interface CartDao<CartTempModel> {
    void addToCart(String Quantity, String id);
    List<CartTempModel> showCart(String id);
    void deleteCartItem(String id);


}
