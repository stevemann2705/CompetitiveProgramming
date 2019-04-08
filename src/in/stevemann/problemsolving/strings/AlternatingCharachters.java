package in.stevemann.problemsolving.strings;

public class AlternatingCharachters {

    // Complete the alternatingCharacters function below.
    static int alternatingCharacters(String s) {
        char checkingFor = s.charAt(0);
        int deletions = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == checkingFor) {
                deletions++;
            } else {
                checkingFor = s.charAt(i);
            }
        }
        return deletions;
    }

    public static void main(String[] args) {
        String testString = "AABBAABABBAAAAB";
        int minimumDeletions = alternatingCharacters(testString);

        System.out.println(minimumDeletions);
    }
}
