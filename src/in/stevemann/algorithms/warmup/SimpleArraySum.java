package in.stevemann.algorithms.warmup;

import java.util.Arrays;

public class SimpleArraySum {
    static int simpleArraySum(int[] ar) {
        return Arrays.stream(ar).sum();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(simpleArraySum(arr));
    }
}
