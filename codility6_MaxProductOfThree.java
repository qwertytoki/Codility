// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution { 
    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        int size = A.length-1;
        int one = A[size];
        int two = A[size-1];
        int three = A[size-2];
        
        int posiThree = one * two * three;

        int negOne = A[0];
        int negTwo = A[1];
        int negTwoPosOne = negOne*negTwo *one;
        
        return Math.max(posiThree,negTwoPosOne);
    }
}
