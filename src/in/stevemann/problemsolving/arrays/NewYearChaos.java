package in.stevemann.problemsolving.arrays;

public class NewYearChaos {

    static void minimumBribes(int[] q) {
        int bribe = 0;
        for (int i = 0; i < q.length; i++) {
            int diff = q[i] - (i + 1);
            if (diff > 2) {
                System.out.println("Too chaotic");
                return;
            } else if (diff != 0) {
                if (i + 1 < q.length) {
                    if (q[i] > q[i + 1]) {
                        int temp = q[i];
                        q[i] = q[i + 1];
                        q[i + 1] = temp;
                        bribe++;
                        i--;
                    } else {
                        for (int j = i + 1; j < q.length; j++) {
                            if (q[i] > q[j]) {
                                int temp = q[i];
                                q[i] = q[j];
                                q[j] = temp;
                                bribe++;
                            }
                        }
                    }

                }
            }
        }
        System.out.println(bribe);
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 3, 4};
        minimumBribes(arr);
    }
}
