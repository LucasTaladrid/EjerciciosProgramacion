package SumaFilaNumerosImpares;

public class SumaFilaNumerosImpares {
    public static int rowSumOddNumbers(int n) {
        int count=1;
        int first=0;

        for(int i=0;i<n;i++){
            first+=i;
        }

        first=first*2+1;

        int sum=first;

        while(count<n){
            first=first+2;
            sum+=first;
            count++;
        }
        return sum;
        //hacer n*n*n sería lo mismo

    }

    public static void main(String[] args) {
        System.out.println(rowSumOddNumbers(3));
    }

    // En el triangulo hay tantos números como el número de fila que es
    //Hay que averigurar que números son para poder sumarlos, por lo tanto, vamos a calcular cuantos números había antes de esta fila
    //Si estamos en la fila 5, tenemos 5 números, y los números anteriores son 4+3+2+1=10, como solo contamos los impares nos falta la mitad de números 10*2 =20, y como contamos solo los impares empezamos
    //en el 21, como sabemos que van a ser 5 números vamos a obtener los 4 números siguientes impares
}
