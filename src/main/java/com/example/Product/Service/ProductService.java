package com.example.Product.Service;

import com.example.Product.Exception.ProductNotFoundException;
import com.example.Product.Model.Product;

public interface ProductService {

    public Product getProductById(long id) throws ProductNotFoundException;
}
