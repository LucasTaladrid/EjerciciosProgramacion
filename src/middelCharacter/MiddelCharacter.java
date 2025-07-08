package middelCharacter;

public class MiddelCharacter {

    public static String getMiddle(String word) {

        int n=word.length()/2;
       if(word.length()==1){
           return word;
       } else if (word.length()%2==0) {
           return word.substring(n-1,n+1);
       }else {
           return word.substring(n,n+1);
       }
    }

    public static void main(String[] args) {
        System.out.println(getMiddle("testing"));
    }
}
