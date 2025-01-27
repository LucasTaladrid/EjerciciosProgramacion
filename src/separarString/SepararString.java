package separarString;

public class SepararString {
    public static void main(String[] args) {
        String[] prueba=separadorCadena("abcde");
        for(String s: prueba){
            System.out.println(s);
        }

    }
    public static String[] separadorCadena(String s) {
        boolean even= (s.length() % 2) == 0;
        String[]newString;
        if(even){
            newString=new String[(s.length()/2)];
        }else{
           newString=new String[(s.length()/2)+1];
        }
        int pos=0;
        int posAux=2;
       for(int i=0;i<s.length();i+=2){
           if(!even && posAux==(s.length()+1)){
               newString[pos]=s.substring(i,posAux-1)+"_";
           }else{
               newString[pos]=s.substring(i,posAux);
               pos++;
               posAux+=2;
           }
       }
        return newString;
    }
}
/*Forma más eficiente de hacerlo
        Se ahorra un if ya que si la cadena es impar se vuelve impar añadiendo la barra baja
        Se crear el array
        Por último se evita el uso excesivo de variables, se modifica la i según las necesidades.

       if (s.length()%2 == 1) s+="_";
        String[] str = new String[s.length()/2];
        for (int i = 0; i < s.length(); i+=2)
          str[i/2] = s.substring(i, i+2);
        return str;
 */
