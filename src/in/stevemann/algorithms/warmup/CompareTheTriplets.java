package in.stevemann.algorithms.warmup;

import java.util.ArrayList;
import java.util.List;

public class CompareTheTriplets {
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int alice = 0, bob = 0;
        for (int i = 0; i < 3; i++) {
            if (a.get(i) > b.get(i)) {
                alice++;
            } else if (a.get(i) < b.get(i)) {
                bob++;
            } else {
                // Do Nothing
            }
        }

        List<Integer> list = new ArrayList<Integer>();
        list.add(alice);
        list.add(bob);

        return list;

    }

    public static void main(String[] args) {
        List<Integer> alice = new ArrayList<>();
        alice.add(5);
        alice.add(6);
        alice.add(7);

        List<Integer> bob = new ArrayList<>();
        bob.add(3);
        bob.add(6);
        bob.add(10);

        List<Integer> result = compareTriplets(alice, bob);
        System.out.println(result.get(0) + " " + result.get(1));
    }
}
