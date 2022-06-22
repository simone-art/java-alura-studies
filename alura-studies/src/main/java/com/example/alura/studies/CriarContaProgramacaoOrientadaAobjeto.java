package com.example.alura.studies;

public class CriarContaProgramacaoOrientadaAobjeto {
    public static void main(String[] args) {
        //ContaProgramação é uma classe que ao mesmo tempo é uma especificação do objeto
        // primeiraConta é a variável que vai instanciar o objeto
        // Por meio da variável primeiraConta podemos chamar os atributos e atribuir valores
        // new ContaProgramacaoOrientadaAobjeto() permite chamar a classe com seus respectivos atributos
        ContaProgramacaoOrientadaAobjeto  primeiraConta = new ContaProgramacaoOrientadaAobjeto();
        primeiraConta.saldo = 200;
        System.out.println("O saldo é: " + 200);

    }

}
