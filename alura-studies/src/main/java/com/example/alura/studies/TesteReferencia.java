package com.example.alura.studies;

public class TesteReferencia {
        public static void main(String[] args) {
            ContaProgramacaoOrientadaAobjeto primeiraConta = new ContaProgramacaoOrientadaAobjeto();
            primeiraConta.setSaldo(300);
            System.out.println("saldo da primeira: " + primeiraConta.getSaldo());
            ContaProgramacaoOrientadaAobjeto segundaConta = primeiraConta;

            // Imprime 1500, pois as duas referências (minhaConta e outraConta)
            //apontam para o mesmo objeto (ContaProgramaçãoOrientadaAoBJETO),
            // Fazendo com que a quantidade 1000 seja somada à anterior 500.

            ContaProgramacaoOrientadaAobjeto minhaConta = new ContaProgramacaoOrientadaAobjeto();
            minhaConta.setSaldo(500);
            // Lembre-se = no Java copia o que está na direita e cola na esquerda
            ContaProgramacaoOrientadaAobjeto outraConta = minhaConta;
            outraConta.setSaldo(1000.0);
            System.out.println(minhaConta.getSaldo());
        }
}

