package in.stevemann.datastructures;

public class TwoDimensionalArrays {
    static int hourglassSum(int[][] arr) {
        int[] hourglasses = new int[16];
        int index = 0;
        for (int i = 0; i < arr[0].length - 2; i++) {
            for (int j = 0; j < arr[0].length - 2; j++) {
                hourglasses[index++] = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
            }
        }
        int highest = Integer.MIN_VALUE;
        for (int a : hourglasses) {
            if (a > highest) {
                highest = a;
            }
        }

        return highest;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4, 5, 6}, {1, 2, 3, 4, 5, 6}, {1, 2, 3, 4, 5, 6}, {1, 2, 3, 4, 5, 6}, {1, 2, 3, 4, 5, 6}, {1, 2, 3, 4, 5, 6}};

        System.out.println(hourglassSum(arr));
    }
}
