package com.pedrosmaxy.trilhajavabasicos.desafios.bancopoo.models;

public interface IConta {

    void sacar(Double valor);

    void depositar(Double valor);

    void transferir(Conta contaDestino);
}
