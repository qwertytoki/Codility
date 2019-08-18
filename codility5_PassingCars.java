// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int passedCars = 0;
        for(int i =0;i<A.length;i++){
            if(A[i]==0){
                for(int j=i;j<A.length;j++){
                    if(A[j]==1){
                        passedCars++;
                    }
                }
            }
        }
        return passedCars;
    }
}
