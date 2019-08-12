import java.util.Arrays;

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    int maxValue = 0;

    public int[] solution(int N, int[] A) {
        // write your code in Java SE 8
        int maxSetCount = getMaxSetCount(N, A);
        int currentMaxSet = 0;
        int[] counters = new int[N];
        for (int i = 0; i < A.length; i++) {
            if (A[i] == N + 1) {
                currentMaxSet++;
                if (maxSetCount == currentMaxSet) {
                    counters = setMaxValToAll(N);
                }
            } else {
                counters[A[i] - 1]++;
                compareMaxValue(counters[A[i] - 1]);
            }
        }
        return counters;
    }

    private int getMaxSetCount(int N, int[] A) {
        int maxSetCount = 0;
        for (int i : A) {
            if (i == N + 1) {
                maxSetCount++;
            }
        }
        return maxSetCount;
    }

    private void compareMaxValue(int val) {
        if (val > maxValue) {
            maxValue = val;
        }
    }

    private int[] setMaxValToAll(int N) {
        int[] counters = new int[N];
        Arrays.fill(counters, maxValue);
        return counters;
    }

    private int[] getTestVal(int N) {
        int[] counters = new int[N];
        for (int i = 0; i < counters.length; i++) {
            counters[i] = N + 1;
        }
        return counters;
    }
}
