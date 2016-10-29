public class maxLength {
    
    public static int maxLength(int[] a, int k) {
        int start = 0;
        int end = 0;
        int maxLength = 0;
        int sum = a[0];
        while (end < a.length) {
            if (sum < k) {
                if (end < a.length - 1)
                    sum += a[++end];
                else maxLength = Math.max(maxLength,end - start + 1);
            } else if (sum == k) {
                maxLength = Math.max(maxLength, end-start+1);
                if (end < a.length - 1) {
                    sum = sum - a[start] + a[++end];
                    start++;
                } else break;
            } else {
                maxLength = Math.max(maxLength, end-start);
                if (end < a.length - 1) {
                    sum = sum - a[start] + a[++end];
                    start++;
                } else break;
            }

        }
        return maxLength;

    }
}