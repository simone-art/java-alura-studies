package com.example.alura.studies;

public class UsandoStaticNaProgramacaoOrientadaObjeto {

    public static void main(String[] args) {
        ContaProgramacaoOrientadaAobjeto conta = new ContaProgramacaoOrientadaAobjeto(1337, 24226);
        System.out.println(conta.getAgencia());
        conta.setAgencia(1232123);

        ContaProgramacaoOrientadaAobjeto conta2 = new ContaProgramacaoOrientadaAobjeto(1337, 16549);
        ContaProgramacaoOrientadaAobjeto conta3 = new ContaProgramacaoOrientadaAobjeto(2112, 14660);

    }


}
