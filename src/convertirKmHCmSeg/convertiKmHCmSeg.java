package convertirKmHCmSeg;

public class convertiKmHCmSeg {
    public static void main(String[] args) {

    }
    public static int convertirVelocida(double velKm){

        double resultado = (velKm * 100000) / 3600;
        return (int) Math.floor(resultado);

    }
    /*
    1km=1000m
    1m=100 cm
    1h=3600 seg
    X km/h * 1000m/1km * 100cm/1m * 1h/ 3600 seg
       -  -       -   -          -    -   Borramos las unidades similares y solo nos quedamos con cm/seg
    (X * 1000 * 100) / 3600

    Para hacer la conversión se debe de multiplicar por 100000 y dividir por 3600

     */
}
