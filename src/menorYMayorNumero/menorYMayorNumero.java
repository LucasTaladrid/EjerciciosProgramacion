package menorYMayorNumero;

import java.util.Arrays;

public class menorYMayorNumero {
    public static void main(String[] args) {
        for(Integer n: menorMayorNumero(new int[]{1,2,3,9,254,4,5,-6,0})){
            System.out.println(n);
        }

    }
    
    public static int [] menorMayorNumero(int [] arr){
        Arrays.sort(arr); //Como se vio en otros ejercicios podemos ordenar arrays muy rápido
        int [] result = new int[2];//Solo queremos dos números
        result[0]=arr[0];//Tomamos el primer resultado del array ordenado
        result[1]=arr[arr.length-1];//Tomamos el último resultado del array ordenado

        return result;

    }
}
