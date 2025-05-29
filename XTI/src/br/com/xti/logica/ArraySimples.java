package br.com.xti.logica;
import java.util.Arrays;


public class ArraySimples {
    public static void main(String[] args){
        int[] impares = new int[5];
        String[] paises = {"Brasil","Russia","Polonia"};
        System.out.println(paises[0]);
        paises[0] = "BRAZIL";
        System.out.println(Arrays.toString(paises));

        //pesquisa
        int posicao = Arrays.binarySearch(paises, "Russia");
        System.out.println(posicao);
        //ordenar arrays
        Arrays.sort(paises, 0, paises.length);
        System.out.println(Arrays.toString(paises));

        Double[] valores = {12.35, 3456.45};
        System.out.println(valores[0].doubleValue());
        

    }
}
