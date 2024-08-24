package com.example.Product.Controller;

import com.example.Product.Exception.ProductNotFoundException;
import com.example.Product.Model.Product;
import com.example.Product.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Products")
public class FakeStoreProductController{
    @Autowired
    private ProductService productService;

    @GetMapping("/{productId}")
    public ResponseEntity<Product> getProductById(@PathVariable("productId") int id)
                         throws ProductNotFoundException {
//        if(id<1 || id>20){
//            return new ResponseEntity<>(HttpStatusCode.valueOf(404));
//        }
        Product product=productService.getProductById(id);
        return new ResponseEntity<Product>(product,HttpStatusCode.valueOf(200));
    }
//    @ExceptionHandler(ProductNotFoundException.class)
//    public ResponseEntity<String> getProductNotFoundException(ProductNotFoundException e){
//        return new ResponseEntity<String>(e.getMessage(),HttpStatusCode.valueOf(400));
//    }
}
