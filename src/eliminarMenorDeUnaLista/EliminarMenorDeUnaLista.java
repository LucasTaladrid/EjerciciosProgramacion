package eliminarMenorDeUnaLista;

public class EliminarMenorDeUnaLista {
    public static void main(String[] args) {
        int[] arr= {5,4,3,1,2,1};
        int []nuevo=eliminarMenor(arr);
        for(Integer n: nuevo){
            System.out.println(n);
        }

    }
    public static int[] eliminarMenor(int[]arr){
        int min=Integer.MAX_VALUE;
        int pos=-1;
        //Lo primero asegurarnos que se devuelva un array vacío si se nos da un array vacío
        if(arr.length==0){
            return arr;
        }

        //Encontramos el número más pequeño y su posición
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min && arr[i]!=min){
                min=arr[i];
                pos=i;
            }
        }
        //Creamos un nuevo array saltándonos la posición del mínimo.
        int[] nuevo = new int[arr.length - 1];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i != pos) {
                nuevo[count++] = arr[i];
            }
        }
    return nuevo;
    }
}
