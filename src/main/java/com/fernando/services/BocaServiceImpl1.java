package com.fernando.services;

import org.springframework.stereotype.Service;

@Service(value = "b1")
public class BocaServiceImpl1 implements BocaService{
    @Override
    public String falar() {
        return "Tchau";
    }
}
