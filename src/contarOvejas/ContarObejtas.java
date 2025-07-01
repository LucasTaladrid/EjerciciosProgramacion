package contarOvejas;

public class ContarObejtas {
    public static int countSheeps(Boolean[] arrayOfSheeps) {
        int count=0;
        for(int i=0;i<arrayOfSheeps.length;i++){
            if(arrayOfSheeps[i]!=null && arrayOfSheeps[i]){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countSheeps(new Boolean[] { false, null, null}));
    }
}
