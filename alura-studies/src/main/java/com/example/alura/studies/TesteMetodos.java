package com.example.alura.studies;

public class TesteMetodos {
    public static void main(String[] args) {
        ContaProgramacaoOrientadaAobjeto contaDoPaulo = new ContaProgramacaoOrientadaAobjeto();
        contaDoPaulo.setSaldo(100);
        contaDoPaulo.deposita(50);
        System.out.println(contaDoPaulo.getSaldo());

        // Para invocar métodos se usan os parêntesis
        contaDoPaulo.saca(20);
        System.out.println(contaDoPaulo.getSaldo());
    }
}
