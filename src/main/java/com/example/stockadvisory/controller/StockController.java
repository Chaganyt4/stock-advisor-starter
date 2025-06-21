package com.example.stockadvisory.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/stocks")
public class StockController {

    @GetMapping("/hello")
    public String hello() {
        return "This is a secured stock data endpoint!";
    }
}
