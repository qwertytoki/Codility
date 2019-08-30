// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        /**
         * for
         * 3 -4 6 -2 100
         * add value if sum is positive.
         * if not, clear the value and save to maxVal
         * current value will not be replaced if:
         * 1 coming value is positive
         * 2 coming value is negative but lower than current value
         * 3 current value is negative
         */
        
        if(A.length==0){
            return 0;
        }
        int maxVal = A[0];
        int currentVal = A[0];
        
        for(int i=1;i<A.length;i++){
            if(currentVal<0){
                if(A[i]>currentVal+A[i]){
                    maxVal = Math.max(currentVal, maxVal);
                    currentVal = A[i];
                }
            }
            if(currentVal+A[i]>0){
                currentVal += A[i];
            }else{
                maxVal = Math.max(currentVal, maxVal);
                currentVal = A[i];
            }
        }
        
        return maxVal;
    }
}
