package com.products.demo.product.example.service;

import com.products.demo.product.example.pojo.Product;
import com.products.demo.product.example.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public List<Product> getProductList(){
        return productRepository.findAll();
    }

    public Product saveProductToDB(Product product){
        return productRepository.save(product);
    }

    public Optional<Product> getProductById(int id){
        return productRepository.findById(id);
    }

    public String deleteProductById(int id){
        String result;
        try{
            productRepository.deleteById(id);
             result= "Product Deleted";
        } catch(Exception e){
            result ="Issue Product";
        }
        return result;
    }
}
