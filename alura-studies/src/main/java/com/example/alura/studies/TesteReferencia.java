package com.example.alura.studies;

public class TesteReferencia {
        public static void main(String[] args) {
            ContaProgramacaoOrientadaAobjeto primeiraConta = new ContaProgramacaoOrientadaAobjeto();
            primeiraConta.saldo = 300;
            System.out.println("saldo da primeira: " + primeiraConta.saldo);
            ContaProgramacaoOrientadaAobjeto segundaConta = primeiraConta;

            // Imprime 1500, pois as duas referências (minhaConta e outraConta)
            //apontam para o mesmo objeto (ContaProgramaçãoOrientadaAoBJETO),
            // Fazendo com que a quantidade 1000 seja somada à anterior 500.

            ContaProgramacaoOrientadaAobjeto minhaConta = new ContaProgramacaoOrientadaAobjeto();
            minhaConta.saldo = 500.0;
            // Lembre-se = no Java copia o que está na direita e cola na esquerda
            ContaProgramacaoOrientadaAobjeto outraConta = minhaConta;
            outraConta.saldo += 1000.0;
            System.out.println(minhaConta.saldo);
        }
}

