// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        /**
         * look for smallest divide place
         * create 2 valiables. one start from 0, the other start from end.
         * compare and record minimum value
         */
        int sum = 0;
        int minVal = Integer.MAX_VALUE;
        for(int i:A){
            sum+=i;
        }
        for(int i:A){
            sum-=i*2;
            sum = sum<0 ? sum*-1:sum;
            minVal = Math.min(minVal,sum);
        }

        return minVal;
    }
}
