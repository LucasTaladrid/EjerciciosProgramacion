package primeraLetraNoRepetida;

public class PrimeraLetraNoRepetida {
    public static String firstNonRepeatingLetter(String s){
        for (String str : s.split("")) {
            if (s.toUpperCase().indexOf(str.toUpperCase()) == s.toUpperCase().lastIndexOf(str.toUpperCase())) return str;
        }
        return "";
    }

    public static void main(String[] args) {
        String test = "moon-men";
        System.out.println(  firstNonRepeatingLetter(test));

    }


}
/*
Lo más sencillo es convertir la letra a verificar y todo el string a mayúsculas o minúsculas y luego ver si su primera posición coincide con la última, si es así solo aparece una vez.

 */

