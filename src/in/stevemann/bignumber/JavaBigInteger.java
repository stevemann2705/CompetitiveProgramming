package in.stevemann.bignumber;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String b = in.nextLine();

        BigInteger biga = new BigInteger(a);
        BigInteger bigb = new BigInteger(b);

        BigInteger bigc = biga.add(bigb);
        BigInteger bigd = biga.multiply(bigb);

        System.out.println(bigc.toString());
        System.out.println(bigd.toString());
    }
}
