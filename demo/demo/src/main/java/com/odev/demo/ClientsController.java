package com.odev.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/clients")
public class ClientsController {

    @PostMapping("/add")
    public String add() {
        return "Client add";
    }

    @DeleteMapping("/delete")
    public String delete() {
        return "Client delete";
    }

    @PutMapping("/update")
    public String update() {
        return "Client update";
    }

    @GetMapping("/get")
    public String get() {
        return "Client get";
    }
}
