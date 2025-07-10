package picosLocales;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PicosLocales {
    public static Map<String, List<Integer>> getPeaks(int[] arr) {
        //Declaramos el map
        Map<String,List<Integer>> result=new HashMap<>(){{
          put("pos",new ArrayList<Integer>());
          put("peak",new ArrayList<Integer>());
        }
        };
        //Banderas
        boolean repeat=false;
        int tmp=-1;

        for(int i=1;i<arr.length-1;i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){ //Si el elemento es mayor que el anterior y el siguiente se añade
                result.get("pos").add(i);
                result.get("peak").add(arr[i]);
                repeat=false; //Reseteamos
            }
            if(arr[i]==arr[i+1] && arr[i]>arr[i-1] && !repeat){//Si el elemento es igual al siguiente y mayor al anterior activamos las banderas
                repeat=true;
                tmp=i;
            }
            if(repeat && arr[i]>arr[i+1]){ //Si la bandera esta activda y el elemento es mayor al siguiente lo añadimos y resetamos las banderas
                repeat=false;
                result.get("pos").add(tmp);
                result.get("peak").add(arr[i]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getPeaks(new int[]{11, 10, -2, -3, 0, 9, 9, 15, 14, 11, -3, -1, -3, 6}));
    }
}
