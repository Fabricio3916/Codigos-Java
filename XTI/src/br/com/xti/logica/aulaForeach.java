package br.com.xti.logica;
import java.util.ArrayList;

public class aulaForeach {
    public static void main(String[] args){
        //foreach exercicio
       
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i <10; i++){
            list.add(i);
        }
        for(Integer numeros : list){
            System.out.println(numeros);
        }
        
        

    }
}
