package com.graphql.controller;

import com.graphql.entity.Product;
import com.graphql.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    ProductService productService;


    @QueryMapping
    public List<Product> getProduct() {
        return productService.getProduct();
    }

    @QueryMapping
    public List<Product> productFindByCatogery(@Argument String catogery) {
        return productService.getProductFindByCatogery(catogery);
    }

}
