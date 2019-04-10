package in.stevemann.algorithms.warmup;

import java.io.IOException;
import java.util.Scanner;

public class TimeConversion {
    private static final Scanner scan = new Scanner(System.in);

    static String timeConversion(String s) {
        String substr = s.substring(0, s.length() - 2);
        String ap = s.substring(s.length() - 2);
        String hour = s.substring(0, 2);
        int h = Integer.parseInt(hour);
        if (ap.equals("AM")) {
            if (h == 12) {
                return "00" + substr.substring(2);
            }
            return substr;
        } else if (ap.equals("PM")) {
            if (h == 12) {
                return substr;
            }
            return (h + 12) + substr.substring(2);
        } else {
            return "Error";
        }
    }

    public static void main(String[] args) throws IOException {
        String s = scan.nextLine();

        String result = timeConversion(s);

        System.out.println(result);
    }
}
