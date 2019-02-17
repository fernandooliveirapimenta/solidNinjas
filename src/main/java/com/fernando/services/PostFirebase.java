package com.fernando.services;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service(value = "postFirebase")
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class PostFirebase implements AcaoPosSalvar {

    @Override
    public void acao(Instant instant) {
        System.out.println(instant);

    }
}
