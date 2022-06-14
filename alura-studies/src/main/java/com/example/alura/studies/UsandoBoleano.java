package com.example.alura.studies;

public class UsandoBoleano {
        public static void main(String[] args) {
            System.out.println("testando condicionais");

            int idade = 20;
            int quantidadePessoas = 3;

            // boolean acompanhado = quantidadePessoas >= 2;

            /**
             * A variável acompanhado foi declarada mas nao inicializada
             */
            boolean acompanhado;

            if (quantidadePessoas >= 2) {
                /**
                 * A variável acompanhado foi aqui inicializada
                 * No escopo das chaves a variável true existe
                 * Fora da chave onde termina, ela deixou de existir
                 */
                acompanhado = true;
            } else {
                acompanhado = false;
            }

            System.out.println("valor de acompanhado = " + acompanhado);

            if (idade >= 18 && acompanhado) {
                System.out.println("seja bem vindo");
            } else {
                System.out.println("infelizmente você não pode entrar");
            }
        }
}

