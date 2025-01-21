package funcionAccum;

public class FuncionAccum {
    public static void main(String[] args) {
        System.out.println(accum("abc"));

    }
    
    public static String accum(String text){
        String accumStiring="";

        for(int i=0;i<text.length();i++){
            char aux=text.toUpperCase().charAt(i);
            accumStiring+=aux;
            for(int k=0;k<i;k++){
                char aux2= (char) (aux+32);
                accumStiring+=aux2;
            }
            if(i<text.length()-1){
                accumStiring+="-";
            }
        }
        return accumStiring;
    }

    /*
    Viendo el ejemplo del enunciado lo que nos pide el ejercicio es que tomemos una cadena de texto y dividamos sus letras y las separemos con guiones,
    cada letra deberá de pasar a ser mayúscula y además se le agregará su contraparte en minúscula tantas veces como su posición en la cadena
    Por ejemplo: si tenemos una r en la posición 4(el inicio será 0), entonces tendremos que escribir Rrrrr-
    Para obtener las letras en minúscula lo que voy a hacer es obtener la letra en mayúscula y luego restarle 32,
    de esta forma estoy trabajando con unicode y me da igual que letra sea que se que va estar bien.

     */

}
