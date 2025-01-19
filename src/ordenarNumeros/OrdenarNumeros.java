package ordenarNumeros;

import java.util.ArrayList;

import java.util.Collections;

public class OrdenarNumeros {
    public static void main(String[] args) {

        System.out.println(ordenar(0));
    }

    public static int ordenar(int num){
        num=Math.abs(num);
        ArrayList<String> lista = new ArrayList<String>();
       //Uso un do-while para evitar error cuando el número sea solo un 0
        do{
            lista.add(Integer.toString(num%10));
            num=num/10;
        } while (num>0);
        //Usamos la libreria Collections para ordenar los números de menor a mayor
        Collections.sort(lista);
        String aux="";
        for(int i=lista.size()-1;i>=0;i--){
            aux+=(lista.get(i));
        }
        return Integer.parseInt(aux);
    }
}
/*
Forma más eficiente de hacerlo:

        String[] array = String.valueOf(num).split("");
        Arrays.sort(array, Collections.reverseOrder());
        return Integer.valueOf(String.join("", array));
 */