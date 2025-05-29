package br.com.xti.logica;

import java.util.Random;

public class ArrayMulti {
    public static void main(String[] args){
        String[] faces = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei"};
        String[] naipes = {"Espadas", "Paus", "Copas", "Ouros"};

        //Cria o objeto r para randomizar um valor
        Random r = new Random();

        //Escolhe de forma aleatoria uma face
        int indiceFace = r.nextInt(faces.length);
        String face = faces[indiceFace];


        //Escolhe de forma aleatoria um naipe
        int indiceNaipes = r.nextInt(naipes.length);
        String naipe = naipes[indiceNaipes];

        String carta = face + " de " + naipe;
        System.out.println(carta);
    }
}
