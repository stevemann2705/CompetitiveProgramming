package in.stevemann.datastructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaArrayList {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        List<Integer>[] list = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            int d = s.nextInt();
            list[i] = new ArrayList<>();
            for (int j = 0; j < d; j++) {
                list[i].add(s.nextInt());
            }
        }

        int a = s.nextInt();

        int[][] arr = new int[2][a];

        for (int i = 0; i < a; i++) {
            arr[0][i] = s.nextInt();
            arr[1][i] = s.nextInt();
        }

        for (int i = 0; i < a; i++) {
            int r = arr[0][i];
            int c = arr[1][i];

            try {
                System.out.println(list[r - 1].get(c - 1));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }

        }
    }
}
