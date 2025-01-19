package invertirCadena;

import java.util.Scanner;

public class InvertirCadena {
    public static String invertirCadenaBucle(String cadena){
        String nuevaCadena="";

        for(int i=cadena.length()-1;i>=0;i--){
            nuevaCadena=nuevaCadena+cadena.substring(i,i+1);
        }
        return nuevaCadena;
    }
    public static String invertirCadenaStringBuilder( String cadena){
        StringBuilder stringBuilder = new StringBuilder(cadena);
        String nuevaCadena=stringBuilder.reverse().toString();
        return nuevaCadena;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una cadena de texto:");
        String cadena = scanner.nextLine();

        System.out.println(invertirCadenaStringBuilder(cadena));
    }
}
