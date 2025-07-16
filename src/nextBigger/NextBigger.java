package nextBigger;

import java.util.Arrays;

public class NextBigger {
    public static long nextBiggerNumber(long n)
    {
        char[] digits = Long.toString(n).toCharArray();
        int i = digits.length - 2;
        while (i >= 0 && digits[i] >= digits[i + 1]) {
            i--;
        }

        if (i < 0) {
            return -1;
        }

        int j = digits.length - 1;
        while (digits[j] <= digits[i]) {
            j--;
        }


        char tmp = digits[i];
        digits[i] = digits[j];
        digits[j] = tmp;

        Arrays.sort(digits, i + 1, digits.length);

        try {
            return Long.parseLong(new String(digits));
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println(nextBiggerNumber(144));
    }
}
