// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int N) {
        // write your code in Java SE 8
        /**
         * find minimal x*y*2
         * means find minimal N%x=0 and N%y=0, and x*y=N
         * means (i*i<N), x = the closest of i
         */
        int x =0;
        int y =0;
        int squared = 0;
        for(int i = 1;i<=N;i++){
            if(i*i>=N){
                squared = i;
            }
        }
        for(int i= squared;i>1;i--){
            if(N%i==0){
                return i*(N/i)*2;
            }
        }
        throw IllegalArgumentException("no matched N");
    }
}
