package sumaArrayMixto;

import java.util.Arrays;
import java.util.List;

public class SumaArrayMixto {
    public static void main(String[] args) {
        System.out.println(sumList(Arrays.asList("3", 6, 6, 0, "5", 8, 5, "6", 2, "0")));

    }
    public static int sumList(List<?> mixed) {
       int result=0;
       for(int i=0;i<mixed.size();i++){
          if(mixed.get(i) instanceof String){

              result+= Integer.parseInt((String) mixed.get(i));
          }else{

              result+=(int)mixed.get(i);
          }
       }
        return result;
    }

}
/*
Forma más eficiente
return mixed.stream().mapToInt(o -> Integer.parseInt(o.toString())).sum();
 */
