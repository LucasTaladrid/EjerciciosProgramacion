package transformarString;

import java.util.HashMap;
import java.util.Map;

public class TransformarString {
    public static void main(String[] args) {

    }
    public static String transformString(String word){
        word=word.toLowerCase();
        Map<Character,Integer> contarLetras=new HashMap<>();
        //La forma más eficiente seguramente es usar un map, de otra forma sería necesario crear diferentes arrays y luego ir comprando uno por uno los valores.
        for(char c: word.toCharArray()){
            contarLetras.put(c,contarLetras.getOrDefault(c,0)+1);//Si el valor es nuevo usa el default(0) de otra forma ya hará get.
        }
        //Lo mejor es usar un stringBuilder, ya que nos permite ir formando el string
        StringBuilder stringBuilder = new StringBuilder();

        for(char c: word.toCharArray()){
            if(contarLetras.get(c)>1){
                stringBuilder.append(")");
            }else {
                stringBuilder.append("(");
            }
        }

        return stringBuilder.toString();
    }

}
