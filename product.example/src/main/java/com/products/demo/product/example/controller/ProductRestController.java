package com.products.demo.product.example.controller;

import com.products.demo.product.example.pojo.Product;
import com.products.demo.product.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductRestController {

    @Autowired
    private ProductService productService;
    private Object p_id;


    @PostMapping("/addProduct")   // Update is same operation
    public Product saveProduct(@RequestBody Product product){
        return productService.saveProductToDB(product);
    }

    @GetMapping("/getProductList")  //  or   @RequestMapping(path="/getProductList", method = RequestMethod.GET)
    public List<Product> getProductList(){
        List<Product> products = new ArrayList<>();
        //logic to fetch from db using service
        products = productService.getProductList();
        return products;
    }

    @GetMapping("/getProductById/{id}")  //  or   @RequestMapping(path="/getProductList", method = RequestMethod.GET)
    public Product getProductById(@PathVariable int id){
        return productService.getProductById(id).get();
    }

    @DeleteMapping("/deleteProductById/{id}")
    public String deleteProductById(@PathVariable int id){
        return productService.deleteProductById(id);
    }

}
