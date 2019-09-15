// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int total = 0;
        for(int i:A){
            total+=i;
        }
        int minDistance = Integer.MAX_VALUE;
        int current = 0;
        int last = total;
        for(int i=0;i<A.length-1;i++){
            current +=A[i];
            last -=A[i];
            minDistance = Math.min(minDistance,Math.abs(current-last));
        }
        return minDistance;
    }
}
