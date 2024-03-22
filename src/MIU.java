import java.util.HashMap;
import java.util.Map;

public class MIU {
    public static void main(String[] args) {
        // Testing
        int[] a1 = {1, 1, 1, 5, 5, 5, 5, 8, 8, 8};
        int[] a2 = {1, 1, 5, 5, 5, 5, 8, 8, 8};
        int[] a3 = {5, 5, 5, 15};
        int[] a4 = {3, 3, 3, 2, 2, 2, 5, 5, 5};
        int[] a5 = {3, 3, 3, 2, 2, 2, 1, 1, 1};
        int[] a6 = {1, 1, 1};
        int[] a7 = {1, 1, 1, 1, 1, 1, 1};

        System.out.println(isStepped(a1));
        System.out.println(isStepped(a2));
        System.out.println(isStepped(a3));
        System.out.println(isStepped(a4));
        System.out.println(isStepped(a5));
        System.out.println(isStepped(a6));
        System.out.println(isStepped(a7));
    }

    public static int sameNumberOfFactors(int n1, int n2) {
        if (n1 < 0 || n2 < 0) {
            return -1;
        }

        int factorsOfN1 = 0;
        int factorsOfN2 = 0;

        for (int i = 1; i <= n1; i++) {
            if (n1 % i == 0) {
                factorsOfN1++;
            }
        }

        for (int i = 1; i <= n2; i++) {
            if (n2 % i == 0) {
                factorsOfN2++;
            }
        }

        if (factorsOfN1 == factorsOfN2) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int hasSingleMaximum(int[] a) {
        int count = 0;
        int maxNum = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > maxNum) {
                maxNum = a[i];
                count = 1;
            } else if (a[i] == maxNum) {
                count++;
            }
        }

        if (count == 1) {
            return 1;
        } else {
            return 0;
        }
    }
    public static int isStepped(int[] a) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int prev = Integer.MIN_VALUE;

        for (int num : a) {
            if (num < prev) {
                return 0;
            }
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            prev = num;
        }

        for (int count : countMap.values()) {
            if (count < 3) {
                return 0;
            }
        }

        return 1;
    }
}
