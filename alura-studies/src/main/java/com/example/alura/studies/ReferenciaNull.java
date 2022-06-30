package com.example.alura.studies;

public class ReferenciaNull {
    public static void main(String[] args) {
        ContaProgramacaoOrientadaAobjeto contaDaMarcela = new ContaProgramacaoOrientadaAobjeto();
        contaDaMarcela.setSaldo(300);
        System.out.println(contaDaMarcela.getSaldo());

        // Uma referência é tida como null porque ainda não foi populada (preenchida com valor ou conteúdo)
        // Para popular uma referência basta inserirmos um valor dentro dela,
        // normalmente através de um new ou apontando para uma referência já existente.

        contaDaMarcela.setTitular();
        System.out.println(contaDaMarcela.setTitular());

        contaDaMarcela.setTitular().nome = "Marcela";
        System.out.println(contaDaMarcela.getTitular().nome);
    }
}
