package in.stevemann.exceptionhandling;

import java.util.Scanner;

class MyCalculator {
    public long power(int a, int b) throws Exception {
        long res = 0L;
        if (a == 0 && b == 0) {
            throw new Exception("n and p should not be zero.");
        } else if (a < 0 || b < 0) {
            throw new Exception("n or p should not be negative.");
        } else {
            if (b == 0) {
                return 1;
            }
            res = 1;
            for (int i = 0; i < b; i++) {
                res *= a;
            }
        }

        return res;
    }

}

public class PowerOfNumber {
    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (in.hasNextInt()) {
            int n = in.nextInt();
            int p = in.nextInt();

            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
