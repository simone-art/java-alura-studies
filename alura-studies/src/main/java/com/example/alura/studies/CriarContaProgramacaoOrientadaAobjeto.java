package com.example.alura.studies;

public class CriarContaProgramacaoOrientadaAobjeto {
    public static void main(String[] args) {
        //ContaProgramação é uma classe que ao mesmo tempo é uma especificação do objeto
        // primeiraConta é a variável que vai instanciar o objeto
        // Por meio da variável primeiraConta podemos chamar os atributos e atribuir valores
        // new ContaProgramacaoOrientadaAobjeto() permite chamar a classe com seus respectivos atributos
        ContaProgramacaoOrientadaAobjeto  primeiraConta = new ContaProgramacaoOrientadaAobjeto();
        primeiraConta.setSaldo(200);
        System.out.println("O saldo é: " + 200);
        primeiraConta.setSaldo(100);
        System.out.println(primeiraConta.getSaldo());

        ContaProgramacaoOrientadaAobjeto segundaConta = new ContaProgramacaoOrientadaAobjeto();
        // referência . atributo é uma forma orientada ao objeto.
        segundaConta.setSaldo(200);

        //Accesando o saldo invocando o método getSaldo();
        System.out.println("primeira conta tem " + primeiraConta.getSaldo());
        System.out.println("segunda conta tem " + segundaConta.getSaldo());

        //Quando o Java instancia o objeto o valor do atributo
        // é zero por default como mostra as variáveis abaixo
        //Se você setar um valor na classe principal, na hora de instanciar o objeto esse valor será impresso
        // Na variável primeiraConta.agencia vai ser mostrado o valor 42
        primeiraConta.setAgencia(1337);
        primeiraConta.setNumero(40);
        System.out.println(primeiraConta.getAgencia());
        System.out.println(primeiraConta.getNumero());

        segundaConta.setAgencia(146);
        System.out.println(segundaConta.getAgencia());

        System.out.println("agora a segunda conta está na agencia " + segundaConta.getAgencia());

    }

}
