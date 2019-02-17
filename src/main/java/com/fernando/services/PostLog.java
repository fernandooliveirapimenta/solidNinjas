package com.fernando.services;

import org.springframework.stereotype.Service;

import java.time.Instant;

@Service(value = "postLog")
public class PostLog implements AcaoPosSalvar {
    @Override
    public void acao(Instant instant) {
        System.out.println("Logando post");
    }
}
