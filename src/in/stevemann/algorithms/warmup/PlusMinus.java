package in.stevemann.algorithms.warmup;

public class PlusMinus {
    static void plusMinus(int[] arr) {
        int pos = 0, neg = 0, zero = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                neg++;
            } else if (arr[i] > 0) {
                pos++;
            } else {
                zero++;
            }
        }

        System.out.println((double) pos / arr.length);
        System.out.println((double) neg / arr.length);
        System.out.println((double) zero / arr.length);
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, -2, -3, 0, 1};
        plusMinus(arr);
    }
}
