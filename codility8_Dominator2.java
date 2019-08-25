// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        if(A.length==1)return 0;
        // write your code in Java SE 8
        int needForDominant = A.length/2;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<A.length;i++){
            if(map.get(A[i])!=null){
                int count = map.get(A[i])+1;
                if(count>needForDominant){
                    return i;
                }
                map.put(A[i],count);
            }else{
                map.put(A[i],1);
            }
        }
        return -1;
    }
}