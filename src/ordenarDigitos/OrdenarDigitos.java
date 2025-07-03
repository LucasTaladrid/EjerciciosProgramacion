package ordenarDigitos;

import java.util.ArrayList;
import java.util.Scanner;

public class OrdenarDigitos {
    public static int[] digitize(long n) {
        String tmp = Long.toString(n);
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = tmp.length() - 1; i >= 0; i--) {
            result.add(Character.getNumericValue(tmp.charAt(i)));
        }

        int[] array = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            array[i] = result.get(i);
        }

        return array;
    }
    /*
    El ejercicio se podría realizar de una forma más eficiente usando StringBuilder ya que permite dar la vuelta y transformar en array
     public static int[] digitize(long n) {
        return new StringBuilder().append(n)
                                  .reverse()
                                  .chars()
                                  .map(Character::getNumericValue)
                                  .toArray();
  }
     */
    public static void main(String[] args) {
        System.out.println(25/2);

    }
}
