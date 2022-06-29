package com.example.alura.studies;

public class ReferenciaNull {
    public static void main(String[] args) {
        ContaProgramacaoOrientadaAobjeto contaDaMarcela = new ContaProgramacaoOrientadaAobjeto();
        System.out.println(contaDaMarcela.saldo);

        // Uma referência é tida como null porque ainda não foi populada (preenchida com valor ou conteúdo)
        // Para popular uma referência basta inserirmos um valor dentro dela,
        // normalmente através de um new ou apontando para uma referência já existente.

        contaDaMarcela.titular = new Cliente();
        System.out.println(contaDaMarcela.titular);

        contaDaMarcela.titular.nome = "Marcela";
        System.out.println(contaDaMarcela.titular.nome);
    }
}
