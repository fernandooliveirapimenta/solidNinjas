package com.fernando.cap4;

public class Frete implements ServicoDeEntrega{


    public double para(String cidade){
        if(cidade.equals("sp")) return 15;
        return 30;
    }
}
