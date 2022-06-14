package com.example.alura.studies;

public class UsandoCondicionais {
    public static void main(String[] args) {

        System.out.println("testando condicionais");
        int idade = 20;
        int quantidadePessoas = 3;
        /**
         * O or || testa se uma das condições é verdadeira
         * o and && testa se as duas são verdadeiras
         */
        if (idade >= 18 || quantidadePessoas >= 2) {
            System.out.println("você tem mais de 18 anos");
            System.out.println("seja bem vindo");
        } else {
            if (quantidadePessoas <= 2)
            System.out.println("infelizmente você não pode entrar");
        }

        int idadeIdoso = 68;
        boolean ehIdoso = idadeIdoso >= 65;
        System.out.println(ehIdoso);

    }
}

