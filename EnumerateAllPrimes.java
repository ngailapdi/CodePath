import java.util.*;
public class EnumerateAllPrimes {
    public int countPrimes(int n) {
        if (n < 3) return 0;
        boolean[] arr = new boolean[n];
        int res = 0;
        for (int i = 2; i < n; i++) {
            if (!arr[i]) {
               res++;
               for (int j = 2; j*i < n; j ++) {
                  arr[j*i] = true;
               }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int n = 50;
        EnumerateAllPrimes o = new EnumerateAllPrimes();
        System.out.println(o.countPrimes(50));
    }
}