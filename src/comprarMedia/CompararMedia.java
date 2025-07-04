package comprarMedia;

import java.util.Arrays;
import java.util.Scanner;

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
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            for (int j = 0; j < 5; j++) {
                System.out.println(j);
                break;
            }
        }
    }
}
