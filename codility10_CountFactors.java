// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int N) {
        // write your code in Java SE 8
        // prime factorization
        // need to improve performance
        int count = 1;
        for(int i=1;i<=N/2;i++){
            if(N%i==0)count++;
        }
        return count;
    }
}
