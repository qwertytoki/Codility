// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        int maxProfit = 0;
        minDay = 200000;
        for(int day:A){
            minDay = Math.min(minday,day);
            maxProfit = Math.max(maxProfit, day-minDay);
        }
    }
}
