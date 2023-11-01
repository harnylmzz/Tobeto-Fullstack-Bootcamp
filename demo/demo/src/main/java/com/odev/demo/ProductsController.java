package com.odev.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
public class ProductsController {

    @PostMapping("/add")
    public String add() {
        return "Product add";
    }

    @DeleteMapping("/delete")
    public String delete() {
        return "Product delete";
    }

    @PutMapping("/update")
    public String update() {
        return "Product update";
    }

    @GetMapping("/get")
    public String get() {
        return "Product get";
    }
}
