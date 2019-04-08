package in.stevemann.problemsolving.arrays;

public class ArrayReverse {
    static int[] reverseArray(int[] a) {

        int[] arr = new int[a.length];

        for (int i = 0, j = a.length - 1; i < a.length; i++, j--) {
            arr[i] = a[j];
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] revarr = reverseArray(arr);

        for (int i : revarr) {
            System.out.println(i);
        }
    }
}
