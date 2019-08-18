// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int west = 0;
        int east = 0;
        for(int i:A){
            if(i==0){
                west++;
            }
            if(i==1){
                east = east + west;
            }
            if(east >1000000000)return -1;
        }
        return east;
    }
}