// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        /**
         * current Value will be replaced to coming value when:
         * 1 current value is negative
         * 2 current value + coming value is negative
         * compare with max value and current value every end of loop.
         */
        int current = A[0];
        int max = A[0];
        for(int i=1;i<A.length;i++ ){
            int coming = A[i];
            if(current<0){
                current = coming;
            }else if(current + coming<0){
                current = coming;
            }else{
                current += coming;
            }
            max = Math.max(max,current);
        }
        return max;
    }
}

