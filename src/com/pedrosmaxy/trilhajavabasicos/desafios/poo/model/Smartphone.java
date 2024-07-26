package com.pedrosmaxy.trilhajavabasicos.desafios.poo.model;

import com.pedrosmaxy.trilhajavabasicos.desafios.poo.interfaces.AparelhoTelefonico;
import com.pedrosmaxy.trilhajavabasicos.desafios.poo.interfaces.NavegadorInternet;
import com.pedrosmaxy.trilhajavabasicos.desafios.poo.interfaces.ReprodutorMusical;

public abstract class Smartphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.printf("Música %s selecionada%n", musica);
    }

    @Override
    public void ligar(String numero) {
        System.out.printf("Ligando para o número %s . . .%n", numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo. . .");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz!");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.printf("Abrindo a página %s%n", url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página . . .");
    }

    @Override
    public void desligarLigacao() {
        System.out.println("Desligando ligação. . .");
    }
}
