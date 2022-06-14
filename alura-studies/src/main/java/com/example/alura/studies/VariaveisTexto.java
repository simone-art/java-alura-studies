package com.example.alura.studies;

public class VariaveisTexto {
    public static void main(String[] args) {
        /** o tipo char guarda apenas um caractere da tabela unicode
         *
         */
        char letra = 'a';

        System.out.println(letra);

        char valor = 65;  // Compila porque 65 corresponde a uma letra na tabela unicode!
        System.out.println(valor);

        String palavra = "alura cursos online de tecnologia";
        System.out.println(palavra);

        /** neste caso concatena a string com o valor numérico
         *
         */
        palavra = palavra + 2020;
        System.out.println(palavra);
    }
}
