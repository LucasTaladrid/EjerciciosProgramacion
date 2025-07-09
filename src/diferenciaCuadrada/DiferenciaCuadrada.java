package diferenciaCuadrada;

public class DiferenciaCuadrada {
    public static double solution(int[] arr1, int[] arr2) {
        double result=0;
        int len=arr1.length;
        for(int i=0;i<len;i++){
            result+=Math.pow(arr1[i]-arr2[i],2);
        }
        return result/len;
    }
}
