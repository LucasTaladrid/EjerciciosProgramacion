package ordenarStringConNumero;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class OrdenarStringConNumero {
    public static String order(String words) {
        return Arrays.stream(words.split(" "))
                .sorted(Comparator.comparing(s -> Integer.valueOf(s.replaceAll("\\D", ""))))
                .reduce((a, b) -> a + " " + b).get();

    }
    public static void main(String[] args) {

    }
}
