package in.stevemann.strings;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class RegexPatternSyntaxChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        String[] result = new String[testCases];
        String[] strings = new String[testCases];
        int i = 0;
        while(testCases>0){
            String pattern = in.nextLine();
            strings[i++] = pattern;
            testCases--;
        }

        i=0;
        for(String s: strings){
            try{
                Pattern pat= Pattern.compile(s);
            }catch (PatternSyntaxException e){
                result[i++] = "Invalid";
                continue;
            }
            result[i++] = "Valid";
        }

        for(String res: result){
            System.out.println(res);
        }
    }
}
