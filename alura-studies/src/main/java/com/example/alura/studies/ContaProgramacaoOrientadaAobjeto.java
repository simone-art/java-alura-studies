package com.example.alura.studies;

public class ContaProgramacaoOrientadaAobjeto {
    // Definindo os atributos da classe
    // Class é uma palavra reservada do Java
    // Os atributos passaram a ser privado
    // Atributo privado só pode ser usado pela própia clase
    // O atributo privado só e visível apenas para a classe a qual pertence.
     private double saldo;
     private int agencia;
     private int numero;
     // Cliente aqui é uma classe que vai ser usada em outra
    private  Cliente titular;
    //O Static se usa como referência a classe. Neste caso a ContaProgramação
    private static int total;

    // O construtor define as restrições e informações específicas de um objeto
    // Construtor vazio
    public ContaProgramacaoOrientadaAobjeto(){

    }

    // Construtor com parâmetros
    public ContaProgramacaoOrientadaAobjeto(int agencia, int numero){
        ContaProgramacaoOrientadaAobjeto.total ++;
        System.out.println("o total de contas é " + ContaProgramacaoOrientadaAobjeto.total);
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("estou criando uma conta " + this.numero);

    }

    // Criando getters e setters permite prevacer o comportamento do objeto
    public double getSaldo() {
        return saldo;
    }

    // this.saldo = atributo
    // saldo é a variável
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

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

    public Cliente setTitular() {
        return titular;
    }
}
