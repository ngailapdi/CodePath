public class longestSubsequenceSubString {
    public static int longestSubsequence(String x, String y) {
        int[][] ar = new int[y.length()+1][x.length()+1];
        int max = 0;
        for (int i = 0; i <= y.length(); i++) {
            ar[i][0] = 0;
        }
        for (int i = 0; i <= x.length(); i++) {
            ar[0][i] = 0;
        }
        for (int i = 1; i <= y.length(); i++) {
            for (int j = 1; j <= x.length(); j++) {
                if (x.charAt(j-1) == y.charAt(i-1)) {
                    ar[i][j] = ar[i-1][j-1] + 1;
                } else {
                    ar[i][j] = ar[i][j-1];
                }
                max = Math.max(max, ar[i][j]);
            }
        }
        return max;

    }
}