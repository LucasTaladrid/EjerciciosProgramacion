package encontrarNImpar;

public class EncontrarNImpar {
    public static int findIt(int[] a) {
        int count=0;
        for(Integer n: a){
            for(Integer k: a){
                if(n==k){
                    count++;
                }
            }
            if(count%2!=0){
                return n;
            }else{
                count=0;
            }
        }
       return -1;
    }
/*
La forma más eficiente podría ser esta
El operador ^ irá añadiendo o sumando los número según aparezcan por ejemplo 1^1=0 pero 1^1^1=1, el resultado final será el número que se ha repetido de forma impar
public static int findIt(int[] A) {
  	int xor = 0;
    for (int i = 0; i < A.length; i++) {
    	xor ^= A[i];
    }
    return xor;
  }
 */

    public static void main(String[] args) {
        System.out.println(1 + 1 + "2" + 2);
        System.out.println(2 + 2 + "2");
        System.out.println("2" + 2 + 2);
        System.out.println("2" + 2 + 1 + 1);

    }
}
