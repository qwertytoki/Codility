
import java.util.*;

class Solution {
    public int solution(int M, int[] A) {
        // write your code in Java SE 8
        /**
         * this is the permutation problem add xPx patterns while the number is not
         * duplicated. in other words, add own index patterns if it's not duplicated.
         * 1,3,4,1 -> 1,3,4,13,134,34,4,341,41,1 delete before list if they duplicate.
         */
        final int LIMIT = 1000000000;
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int lastIndex = -1;
        for (int i = 0; i < A.length; i++) {
            int currentIndex=map.get(A[i])==null?-1:map.get(A[i]);
            lastIndex = Math.max(currentIndex,lastIndex);
            count += i-lastIndex;
            if (count >= LIMIT) {
                return LIMIT;
            }
            map.put(A[i],i);
        }
        return count;
    }
}
