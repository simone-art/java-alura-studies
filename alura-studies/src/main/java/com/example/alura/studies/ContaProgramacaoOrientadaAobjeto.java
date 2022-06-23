package com.example.alura.studies;

public class ContaProgramacaoOrientadaAobjeto {
    // Definindo os atributos da classe
    // Class é uma palavra reservada do Java
     double saldo;
     int agencia;
     int numero;
     // Cliente aqui é uma classe que vai ser usada em outra
     Cliente titular;

     //Definindo o método
    // Saldo é um atributo da conta
    // Valor é uma variável e dentro do método ele é um parâmetro
    // É opcional usar a aplavra chave this, que faz referência ao atributo do objeto
     public void deposita(double valor){
         this.saldo = this.saldo + valor;
     }

     // Definição de métodos com retornos de valores
     public boolean saca(double valor){
         if(this.saldo >= valor){
             this.saldo = this.saldo - valor;
             return true;
         }else{
             return false;
         }
     }
}
