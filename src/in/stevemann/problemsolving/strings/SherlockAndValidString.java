package in.stevemann.problemsolving.strings;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class SherlockAndValidString {
    static String isValid(String s) {
        boolean flag = true, repeated = false;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }

        int val = map.get(s.charAt(0));
        Collection<Integer> list = map.values();

        for (int i : list) {
            if (i != val) {
                if (i - 1 == 0) {
                    if (repeated) {
                        flag = false;
                        break;
                    }
                    repeated = true;
                } else if (i - val != 1) {
                    flag = false;
                    break;
                } else {
                    if (repeated) {
                        flag = false;
                        break;
                    }
                    repeated = true;
                }
            } else {
                flag = true;
            }
        }

        if (flag) {
            return "YES";
        } else {
            return "NO";
        }
    }

    public static void main(String[] args) {
        String s = "aabbc";
        System.out.println(isValid(s));
    }
}
