// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        int totalCount = 0;
        for(int a:A){
            totalCount = totalCount + a;
        }
        int equilibriumPoint = totalCount/2;
        int halfCount =0;
        for(int a:A){
            halfCount = halfCount+a;
            if(halfCount>=equilibriumPoint)break;
        }
        int result =totalCount-halfCount-halfCount;
        return result>0?result:result*-1;
    }
}
