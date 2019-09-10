// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        /**
         * buy or keep or sell
         * compare maxProfit and coming profit everytime.
         * buy will update when the price is cheaper than buy price
         */
        int buy = 200000;
        int max = 0;
        for(int i:A){
            max = Math.max(i-buy,max);
            buy = Math.min(i,buy);
        }
        return max;
    }
}
