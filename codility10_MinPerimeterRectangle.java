// you can also use imports, for example:
import java.util.*;

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
        
        for(int i= (int)Math.sqrt(N);i>0;i--){
            if(N%i==0){
                return (i+N/i)*2;
            }
        }
        throw new IllegalArgumentException("no matched N");
    }
}
