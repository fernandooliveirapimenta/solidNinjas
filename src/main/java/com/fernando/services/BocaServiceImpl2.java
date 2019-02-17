package com.fernando.services;

import org.springframework.stereotype.Service;

@Service(value = "b2")
public class BocaServiceImpl2 implements BocaService {
    @Override
    public String falar() {
        return "Ola mundo";
    }
}
