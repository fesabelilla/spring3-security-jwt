package com.example.springbootsecurity30.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

    @GetMapping("/welcome")
    public String getWelcomeMsg() {
        return "Welcome to the spring security";
    }

    @GetMapping("/all")
    public String getAllProducts() {
        return "All Products Are Books, Pen, and Tables";
    }

    @GetMapping("/{id}")
    public String getProductById(@PathVariable int id) {
        return getProduct(id);
    }

    private String getProduct(int id) {
        switch (id) {
            case 1:
                return "Pen. Id: " + id ;
            case 2:
                return "Table. Id: " + id;
            default:
                return "Products. Id: " + id;
        }
    }
}
