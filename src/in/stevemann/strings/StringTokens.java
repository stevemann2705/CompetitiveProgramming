package in.stevemann.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] strings = s.split("[^a-zA-Z]");
        List<String> list = new ArrayList<>();
        for (String string: strings){
            if(string.isEmpty()){
                continue;
            }
            list.add(string);
        }
        int count = 0;
        for(String ss: list){
            count++;
        }
        System.out.println(count);
        for (String ss: list){
            System.out.println(ss);
        }
        scan.close();
    }
}
