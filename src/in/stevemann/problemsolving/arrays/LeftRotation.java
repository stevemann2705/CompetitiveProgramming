package in.stevemann.problemsolving.arrays;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LeftRotation {

    private static final Scanner scanner = new Scanner(System.in);

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {
        int[] ret = new int[a.length];
        int shift = 0;
        if (d == a.length) {
            return a;
        } else {
            shift = d % a.length;
            int i = 0;
            for (; i + shift < a.length; i++) {
                ret[i] = a[i + shift];
            }
            for (int j = 0; j < shift; i++, j++) {
                ret[i] = a[j];
            }
            return ret;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int[] result = rotLeft(a, d);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
