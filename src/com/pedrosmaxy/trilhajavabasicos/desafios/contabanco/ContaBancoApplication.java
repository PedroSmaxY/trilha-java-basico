package com.pedrosmaxy.trilhajavabasicos.desafios.contabanco;

import java.util.Scanner;

public class ContaBancoApplication {
    public static void main(String args[]) throws Exception {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("\nBem-Vindo ao Registro Bancário!\n");

            System.out.print("Digite o seu nome completo: ");
            String nomeCliente = entrada.nextLine();

            System.out.print("Digite o número da conta: ");
            int numeroConta = entrada.nextInt();

            System.out.print("Digite o número da agência: ");
            String numeroAgencia = entrada.next();

            System.out.print("Digite o número do seu saldo: ");
            double saldo = entrada.nextDouble();

            System.out.printf(
                    "\nOlá %s, obrigado por criar uma conta em nosso banco!\nSua agência é %s, conta %d e seu saldo %.2f já está disponível para saque\n",
                    nomeCliente, numeroAgencia, numeroConta, saldo);
        }
    }
}
