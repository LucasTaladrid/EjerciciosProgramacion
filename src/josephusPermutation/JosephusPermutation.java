package josephusPermutation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class JosephusPermutation {
    public static <T> List<T> josephusPermutation(final List<T> items, final int k) {
        List<T> result = new ArrayList<>();
        List<T> temp = new ArrayList<>(items);
        int index = 0;

        while (!temp.isEmpty()) {
            index = (index + k - 1) % temp.size();
            result.add(temp.remove(index));
        }

        return result;
    }


    public static void main(String[] args) {
        System.out.println( josephusPermutation(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7)), 3));
        System.out.println(6%7);
    }
}
