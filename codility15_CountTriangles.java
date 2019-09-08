// you can also use imports, for example:
import java.util.*;

class Solution {
    public int solution(int[] A) {

        /**
         * find trianguable triplet 
         * largest < smallest + middle : trianguable
         * O(N^3) is bad.  need to update performance
         */
        
        if(A.length<3)return 0;
        //blute force
        int count =0;
        Arrays.sort(A);
        for(int i =0;i<A.length;i++){
            if(i+3>A.length)break;
            for(int j=i+1;j<A.length;j++){
                for(int k=j+1;k<A.length;k++){
                    if(A[i]+A[j]>A[k])count++;
                }
            }
        }
        return count;
    }
}
