package convertirToCamelCase;

import java.util.ArrayList;


public class convertirToCamelCase {
    public static void main(String[] args) {
        //
         System.out.println(toCamelCase("side-south-Samurai-Yellow-Yellow-Samurai-Ninja_____"));

    }
    public static String toCamelCase(String s){

        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '_' || sb.charAt(i) == '-') {
                if (i + 1 < sb.length()) {
                    sb.setCharAt(i + 1, Character.toUpperCase(sb.charAt(i + 1)));
                }
            }
        }
        return sb.toString().replace("_", "").replace("-", "");
    }
}
