package tenMinWalk;

public class TenMinWalk {
    public static boolean isValid(char[] walk) {

        if(walk.length!=10){
            return false;
        }
        int x=0;
        int y=0;
       for( char dir: walk){
           if(dir=='n'){
             x++;
           } else if (dir=='s') {
              x--;
           } else if (dir=='e') {
            y++;
           } else if (dir=='w') {
             y--;
           }
       }
       if(y==0 && x==0){
           return true;
       }else {
           return false;
       }
    }
}
