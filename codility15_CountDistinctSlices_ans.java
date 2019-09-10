
// you can also use imports, for example:
import java.util.*;

// need to improve performance
class Solution {
    public int solution(int M, int[] A) {
        /**
         * 
         */
        int count = 0;
        int lastIndex = -1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            int preOccurIndex = map.containsKey(A[i]) ? map.get(A[i]) : -1;
            lastIndex = Math.max(preOccurIndex, lastIndex);
            count += i - lastIndex;
            if (count >= 1000000000) {
                return 1000000000;
            }
            map.put(A[i], i);
        }
        return count;
    }
}
