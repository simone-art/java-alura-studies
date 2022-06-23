package com.example.alura.studies;

public class TestaBanco {
    public static void main(String[] args) {

        // Código que representa uma composição de objetos
        // O nome, cpf e profissão são atributos de classe Cliente
        // E o .titular pertence a classe ContaProgramação
        Cliente simone = new Cliente();
        simone.nome = "Simone Santos";
        simone.cpf = "222.222.222.22";
        simone.profissao = "Programadora";
        ContaProgramacaoOrientadaAobjeto contaDaSimone = new ContaProgramacaoOrientadaAobjeto();
        contaDaSimone.deposita(100);

        contaDaSimone.titular = simone;
        System.out.println(contaDaSimone.titular.nome);
    }
}
