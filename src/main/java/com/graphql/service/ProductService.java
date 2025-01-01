package com.graphql.service;

import com.graphql.entity.Product;
import com.graphql.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public List<Product> getProduct(){
        return productRepository.findAll();
    }

    public List<Product> getProductFindByCatogery(String catogery){
        return productRepository.findByCatogery(catogery);
    }

}
