package com.example.alura.studies;

public class TesteMetodos {
    public static void main(String[] args) {
        ContaProgramacaoOrientadaAobjeto contaDoPaulo = new ContaProgramacaoOrientadaAobjeto();
        contaDoPaulo.saldo = 100;
        contaDoPaulo.deposita(50);
        System.out.println(contaDoPaulo.saldo);

        // Para invocar métodos se usan os parêntesis
        contaDoPaulo.saca(20);
        System.out.println(contaDoPaulo.saldo);
    }
}
