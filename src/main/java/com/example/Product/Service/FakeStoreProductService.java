package com.example.Product.Service;

import com.example.Product.DTO.FakeStoreDTO;
import com.example.Product.Exception.ProductNotFoundException;
import com.example.Product.Model.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class FakeStoreProductService implements ProductService{

    @Override
    public Product getProductById(long id) throws ProductNotFoundException{
        String url="https://fakestoreapi.com/products/"+id;
        RestTemplate restTemplate=new RestTemplate();
        FakeStoreDTO fakeStoreDTO=restTemplate.getForObject(url, FakeStoreDTO.class);
        if(fakeStoreDTO==null){
            throw new ProductNotFoundException("Product with the given id "+id+" Not found." +
                    " Kindly give id within 1 to 20");
        }
        return convertDtoToProduct(fakeStoreDTO);
    }

    public Product convertDtoToProduct(FakeStoreDTO fakeStoreDTO) {
        Product product=new Product();
        product.setId(fakeStoreDTO.getId());
        product.setName(fakeStoreDTO.getTitle());
        product.setDescription(fakeStoreDTO.getDescription());
        product.setCategory(fakeStoreDTO.getCategory());
        return product;
    }
}
