package in.stevemann.problemsolving.arrays;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class ArrayManipulation {

    private static final Scanner scanner = new Scanner(System.in);

    // Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int[][] queries) {
        Map<Long, Long> map = new HashMap<Long, Long>();
        //init map
        for (long i = 0; i < n; i++) {
            map.put(i, 0L);
        }

        for (long i = 0; i < queries.length; i++) {
            long a = queries[(int) i][0] - 1, b = queries[(int) i][1] - 1, s = queries[(int) i][2];
            for (long j = a; j <= b; j++) {
                map.put(j, map.get(j) + s);
            }
        }
        Collection<Long> collection = map.values();
        List<Long> list = new ArrayList(collection);
        Collections.sort(list);
        return list.get(list.size() - 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[][] queries = new int[m][3];

        for (int i = 0; i < m; i++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowItems[j]);
                queries[i][j] = queriesItem;
            }
        }

        long result = arrayManipulation(n, queries);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
