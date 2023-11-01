package com.odev.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
public class ProductsController {

    @PostMapping("/add")
    public String add() {
        return "add";
    }

    @DeleteMapping("/delete")
    public String delete() {
        return "delete";
    }

    @PutMapping("/update")
    public String update() {
        return "update";
    }

    @GetMapping("/get")
    public String get() {
        return "Product get";
    }
}
