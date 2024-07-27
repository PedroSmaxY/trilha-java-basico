package com.pedrosmaxy.trilhajavabasicos.desafios.bancopoo.models;

public abstract class Conta implements IConta {

    private static final Integer AGENCIA_PADRAO = 1;

    private static Integer SEQUENCIAL = 1;

    protected Integer agencia;
    protected Integer numero;
    protected Double saldo;

    public Conta() {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }

    @Override
    public void sacar(Double valor) {
    }

    @Override
    public void depositar(Double valor) {
    }

    @Override
    public void transferir(Conta contaDestino) {
    }

    public Integer getAgencia() {
        return agencia;
    }

    public Integer getNumero() {
        return numero;
    }

    public Double getSaldo() {
        return saldo;
    }

}
