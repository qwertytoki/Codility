// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8

        // need to consider overflow!
        Arrays.sort(A);
        for(int i =0;i<A.length-2;i++){
            if(A[i]<0)continue;
            
            int a = A[i];
            int b = A[i+1];
            int c = A[i+2];
            
            if(a+b>c)return 1;
        }
        return 0;
    }
}
