package com.example.alura.studies;

public class PracticandoComForeBreak {
    public static void main(String[] args) {
        for(int linha = 0; linha < 5; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                if (coluna > linha) {
                    // O break irá interromper apenas o laço de repetição mais interno que o contém.
                    break;
                }
                System.out.print( coluna+1);
            }
            System.out.println();
        }
    }

}

