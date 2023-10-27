package com.example.consumerapi.controller;

import com.example.consumerapi.model.Product;
import com.example.consumerapi.rest.ProductClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/api")
public class ApiController {

    @Autowired
    private ProductClient productClient;

    @GetMapping(value = "/products")
    public List<Product> getProducts(){
        return productClient.getProducts(Map.of("Authorisation","4545454545455"));
    }

    @GetMapping(value = "/products/{id}")
    public Product getProducts(@PathVariable Long id){
        return productClient.getProduct(id);
    }
}
