package in.stevemann.bignumber;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class BigDecimalProblem {
    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();
        // --------------------- APPROACH 1 (FAILED) ------------------------------
        // Cannot maintain order of same numbers
//        List<BigDecimal> list = new ArrayList<>();
//
//        for(int i=0; i<n; i++){
//            list.add(new BigDecimal(s[i]));
//        }
//
//        Collections.sort(list);
//        Collections.reverse(list);
//
//        for(int i=0; i<n; i++){
//            int index = list.indexOf(new BigDecimal(s[i]));
//            if(index != i){
//                if(new BigDecimal(s[i]).equals(new BigDecimal(s[index]))){
//                    String ss = s[index];
//                    s[index] = s[i];
//                    s[i] = ss;
//                } else if(!(new BigDecimal(s[i]).equals(new BigDecimal(s[index])))){
//                    String ss = s[index];
//                    s[index] = s[i];
//                    s[i] = ss;
//                    i--;
//                }
//            }
//
//        }

        // --------------------- APPROACH 2 ---------------------------------------

        String[] newArray = new String[n];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = s[i];
        }

        Arrays.sort(newArray, Collections.reverseOrder(new Comparator<String>() {
            @Override
            public int compare(String a1, String a2) {
                BigDecimal a = new BigDecimal(a1);
                BigDecimal b = new BigDecimal(a2);
                return a.compareTo(b);
            }
        }));

        s = newArray;

        //Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}