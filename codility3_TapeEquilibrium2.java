// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        
        int totalCount = 0;
        for (int a : A) {
            totalCount = totalCount + a;
        }
        int equilibriumPoint = totalCount / 2;
        int halfCountCandi1 = 0;
        int halfCountCandi2 = 0;
        for (int a : A) {
            halfCountCandi1 = halfCountCandi1 + a;
            if (halfCountCandi1 >= equilibriumPoint) {
                halfCountCandi2 = halfCountCandi1 - a;
                break;
            }
        }
        int resultCandi1 = totalCount - halfCountCandi1 - halfCountCandi1;
        int resultCandi2 = totalCount - halfCountCandi2 - halfCountCandi2;
        if (resultCandi1 < 0) {
            resultCandi1 = resultCandi1 * -1;
        }
        if (resultCandi2 < 0) {
            resultCandi2 = resultCandi2 * -1;
        }
        return resultCandi1 < resultCandi2 ? resultCandi1 : resultCandi2;
    }
}
