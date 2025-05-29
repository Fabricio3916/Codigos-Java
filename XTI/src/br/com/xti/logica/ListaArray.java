package br.com.xti.logica;
import java.util.ArrayList;

public class ListaArray {
    public static void main(String[] args){
        ArrayList<String> cores = new ArrayList<>();
        cores.add("Branco");
        cores.add("Vermelho");
        cores.add("Azul");
        cores.add("Preto");
        System.out.println(cores.toString());

        System.out.println("Tamanho = " + cores.size());
        System.out.println("Elemento2 = " + cores.get(2));
        System.out.println("Indice Branco = " + cores.indexOf("Branco"));
        System.out.println("Tem cinza? " + cores.contains("Cinza"));
    }
}
