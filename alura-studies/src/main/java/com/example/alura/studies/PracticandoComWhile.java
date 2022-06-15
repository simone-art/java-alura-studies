package com.example.alura.studies;

public class PracticandoComWhile {
    /**
     * While é um laço de repetiçao simples que deve conter uma variável declarada e inicializada
     */
    public static void main(String[] args) {
        int contador = 0;
        while(contador <= 10){
            System.out.println(contador);
            //Contador pode ser escrito assim: contador += 1 ou contador++
            //contador = contador + 1;
            //contador += 1;
            contador++;
        }
    }
}
