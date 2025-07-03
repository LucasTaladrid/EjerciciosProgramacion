package comprarMedia;

import java.util.Arrays;

public class CompararMedia {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int average =0;
        for(Integer i : classPoints){
            average+=i;
        }
        average=(average+yourPoints)/(classPoints.length+1);
        if(yourPoints>average){
            return true;
        }else {
            return false;
        }
    }
    //  return Arrays.stream(classPoints).average().orElse(0) < yourPoints;
}
