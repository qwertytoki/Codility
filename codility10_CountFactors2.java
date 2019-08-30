// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int N) {
        // write your code in Java SE 8
        // prime factorization
        // need to improve performance
        int count = 0;
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                if (i * i == N) {
                    count++;
                    break;
                } else if (i * i >= N) {
                    break;
                }
                count += 2;
            }
        }
        return count;
    }
}
