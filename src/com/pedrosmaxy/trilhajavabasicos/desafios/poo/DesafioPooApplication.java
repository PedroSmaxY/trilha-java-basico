package com.pedrosmaxy.trilhajavabasicos.desafios.poo;

import com.pedrosmaxy.trilhajavabasicos.desafios.poo.model.Iphone;

public class DesafioPooApplication {
    public static void main(String[] args) {
        Iphone pedroIphone = new Iphone();

        pedroIphone.exibirPagina("github.com/PedroSmaxY");
        pedroIphone.atualizarPagina();

        pedroIphone.ligar("(xx) xxxxx-xxxx");
        pedroIphone.iniciarCorreioVoz();

        pedroIphone.atender();
        pedroIphone.desligarLigacao();

        pedroIphone.selecionarMusica("Hotel California");
        pedroIphone.tocar();
        pedroIphone.pausar();
    }
}
