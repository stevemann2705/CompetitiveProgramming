package in.stevemann.problemsolving.warmup;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RepeatedString {

    private static final Scanner scanner = new Scanner(System.in);

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        long size = s.length();
        long a = 0;
        long repetitions = n / size;
        long padding = n % size;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                a++;
            }
        }

        a *= repetitions;

        for (int i = 0; i < padding; i++) {
            if (s.charAt(i) == 'a') {
                a++;
            }
        }

        return a;

    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
