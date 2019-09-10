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
        int maxValue= A[0];
        int currentValue=A[0];
        for(int i=1;i<A.length;i++){
            if(currentValue<0){
                currentValue = A[i];
            }else if(A[i]>0){
                currentValue+=A[i];
            }else if(currentValue+A[i]>0){
                currentValue+=A[i];
            }else{
                currentValue = A[i];
            }
            maxValue = Math.max(currentValue,maxValue);
        }
        return maxValue;
    }
}
