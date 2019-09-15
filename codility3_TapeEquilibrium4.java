// you can also use imports, for example:
import java.util.*;
class Solution {
    public int solution(int[] A) {
        /**
         * look for smallest divide place
         * compare and record minimum value
         */
        int sum = 0;
        for(int i:A){
            sum+=i;
        }
        int minVal = sum - A[0]*2;
        if(minVal<0)
            minVal= minVal*-1;
        
        for(int i=1;i<A.length-1;i++){
            sum-=A[i]*2;
            sum = sum<0 ? sum*-1:sum;
            minVal = Math.min(minVal,sum);
            
        }
        return minVal;
    }
}
