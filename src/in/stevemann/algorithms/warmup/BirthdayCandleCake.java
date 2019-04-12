package in.stevemann.algorithms.warmup;

import java.util.Arrays;

public class BirthdayCandleCake {
    static int birthdayCakeCandles(int[] ar) {
        int count = 0;
        Arrays.sort(ar);
        for (int a : ar) {
            if (a == ar[ar.length - 1]) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 3, 5, 1, 5};
        System.out.println(birthdayCakeCandles(arr));
    }
}
