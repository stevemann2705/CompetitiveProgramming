package in.stevemann.algorithms.warmup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinMaxSum {
    static void miniMaxSum(int[] arr) {

        List<Long> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            long b = 0L;
            for (int j = 0; j < arr.length; j++) {
                if (!(j == i)) {
                    b += arr[j];
                }
            }
            list.add(b);
        }

        Collections.sort(list);

        System.out.println(list.get(0) + " " + list.get(list.size() - 1));

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        miniMaxSum(arr);
    }
}
