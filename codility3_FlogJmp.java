// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int X, int Y, int D) {
        // write your code in Java SE 8
        int jumpCnt = 0;
        Y= Y-X;
        while(Y > 0){
            Y = Y-D;
            jumpCnt++;
        }
        return jumpCnt;
    }
}