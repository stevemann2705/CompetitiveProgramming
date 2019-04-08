package in.stevemann.problemsolving.arrays;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MinimumSwapsTwo {

    private static final Scanner scanner = new Scanner(System.in);

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
        int swaps = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                int index = 0;
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] == i + 1) {
                        index = j;
                        break;
                    }
                }
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                swaps++;
            }
        }

        return swaps;
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int res = minimumSwaps(arr);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
