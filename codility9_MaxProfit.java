// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8

        /**
         *seek max and min
         * if min -> max : return max-min
         * if max -> min : compare  max - 2ndMin or 2ndMax - min 
         */
        if(A.length==0){
            return 0;
        }

        int[] min = getMin(A);
        int[] max = getMax(A);
        if(min[1]<max[1]){
            return max[0]-min[0];
        }
        int[] secondMin = getMin(Arrays.copyOfRange(A, 0, max[1]));
        int[] secondMax = getMax(Arrays.copyOfRange(A,min[1],A.length));
        int maxProfit =  Math.max(max[0]-secondMin[0],secondMax[0]-min[0]);
        int[] thirdMin = getMin(Arrays.copyOfRange(A,max[1],min[1]));
        int[] thirdMax = getMax(Arrays.copyOfRange(A,thirdMin[1],min[1]));
        return Math.max(maxProfit,thirdMax[0]-thirdMin[0]);
    }
    private int[] getMin(int[] A){
        int[] min = new int[]{Integer.MAX_VALUE,-1};
        for(int i= 0;i<A.length;i++){
            if(min[0]>A[i]){
                min[0] = A[i];
                min[1] = i;
            }
        }
        return min;
    }
    private int[] getMax(int[] A){
        int[] max = new int[]{-1,-1};
        for(int i= 0;i<A.length;i++){
            if(max[0]<A[i]){
                max[0] = A[i];
                max[1] = i;
            }
        }
        return max;
    }
}
