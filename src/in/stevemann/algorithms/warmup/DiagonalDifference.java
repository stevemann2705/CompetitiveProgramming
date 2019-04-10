package in.stevemann.algorithms.warmup;

public class DiagonalDifference {
    static int diagonalDifference(int[][] arr) {
        int n = arr.length;
        int d1 = 0;
        int d2 = 0;
        for (int i = 0; i < n; i++) {
            d1 += arr[i][i];
            d2 += arr[n - 1 - i][i];
        }

        return Math.abs(d1 - d2);

    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {2, 3, 5}, {5, 7, 9}};

        System.out.println(diagonalDifference(arr));
    }
}
