package in.stevemann.strings;

import java.util.Scanner;

public class SubStringSort {

    public static void main(String[] args) {
        System.out.println(getSmallestAndLargest("ASDFHDSFHsdlfhsdlfLDFHSDLFHsdlfhsdlhkfsdlfLHDFLSDKFHsdfhsdlkfhsdlfhsLFDLSFHSDLFHsdkfhsdkfhsdkfhsdfhsdfjeaDFHSDLFHDFlajfsdlfhsdlfhDSLFHSDLFHdlfhs", 30));
    }


        public static String getSmallestAndLargest(String s, int k) {
            String smallest = "";
            String largest = "";

            String[] substrings = new String[s.length()];
            for (int i = 0; i <= s.length() - k; i++) {
                String substr = s.substring(i, i + k);
                substrings[i] = substr;

                for (int j = 0; j<i; j++){
                    if(stringCompare(substrings[j], substrings[i]) > 0){
                        String temp = substrings[j];
                        substrings[j] = substrings[i];
                        substrings[i] = temp;
                    }
                }
            }

            smallest = substrings[0];
            largest = substrings[substrings.length - k];
            return smallest + "\n" + largest;
        }

        public static int stringCompare(String str1, String str2)
        {

            int l1 = str1.length();
            int l2 = str2.length();
            int lmin = Math.min(l1, l2);

            for (int i = 0; i < lmin; i++) {
                int str1_ch = (int)str1.charAt(i);
                int str2_ch = (int)str2.charAt(i);

                if (str1_ch != str2_ch) {
                    return str1_ch - str2_ch;
                }
            }

            // Edge case for strings like
            // String 1="Geeks" and String 2="Geeksforgeeks"
            if (l1 != l2) {
                return l1 - l2;
            }

            // If none of the above conditions is true,
            // it implies both the strings are equal
            else {
                return 0;
            }
        }


    }
