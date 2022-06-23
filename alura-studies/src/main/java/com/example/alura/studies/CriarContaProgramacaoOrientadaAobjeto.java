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
        primeiraConta.saldo += 100;
        System.out.println(primeiraConta.saldo);

        ContaProgramacaoOrientadaAobjeto segundaConta = new ContaProgramacaoOrientadaAobjeto();
        // referência . atributo é uma forma orientada ao objeto.
        segundaConta.saldo = 50;

        System.out.println("primeira conta tem " + primeiraConta.saldo);
        System.out.println("segunda conta tem " + segundaConta.saldo);

        //Quando o Java instancia o objeto o valor do atributo
        // é zero por default como mostra as variáveis abaixo
        System.out.println(primeiraConta.agencia);
        System.out.println(primeiraConta.numero);

    }

}
