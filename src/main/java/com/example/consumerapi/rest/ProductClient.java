package com.example.consumerapi.rest;

import com.example.consumerapi.model.Product;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.service.annotation.GetExchange;

import java.util.List;
import java.util.Map;

public interface ProductClient {
    @GetExchange(value = "/all")
    List<Product> getProducts(@RequestHeader Map<String,String> header);

    @GetExchange(value = "/single-product/{id}")
    Product getProduct(@PathVariable Long id);
}
