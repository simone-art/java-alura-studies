package com.example.alura.studies;

public class ContaProgramacaoOrientadaAobjeto {
    // Definindo os atributos da classe
    // Class é uma palavra reservada do Java
     double saldo;
     int agencia;
     int numero;
     String titular;

     //Definindo o método
    // Saldo é um atributo da conta
    // Valor é uma variável e dentro do método ele é um parâmetro
    // É opcional usar a aplavra chave this, que faz referência ao atributo do objeto
     public void deposita(double valor){
         this.saldo = this.saldo + valor;
     }
}
