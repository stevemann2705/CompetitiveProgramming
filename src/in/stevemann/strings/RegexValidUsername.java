package in.stevemann.strings;

import java.util.Scanner;

public class RegexValidUsername {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}

class UsernameValidator {
    public static final String regularExpression = "[a-zA-Z]{1}\\w{7,29}";
}
