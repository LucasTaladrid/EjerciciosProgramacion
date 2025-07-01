package contarXO;

public class ContarXO {
    public static boolean getXO (String str) {
        int x=0;
        int o=0;
        for(String s: str.split("")){
            if(s.equalsIgnoreCase("x")){
                x++;
            } else if (s.equalsIgnoreCase("o")) {
                o++;
            }
        }

        return x==o?true:false;
    }

    public static void main(String[] args) {
        System.out.println(getXO("zzoo"));
    }
}
