
// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int X, int[] A) {
        X = 100000;
        A = getTestArray();
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            map.put(A[i],i);
        }
        for(int i=0;i<X;i++){
            if(map.get(i)==null){
                return -1;
        }
        return map.get(X);
    }
    private int[] getTestArray(){
        int[] A = new int[100000];
        for(int i =0;i<100000;i++){
            A[i] = i+1;
        }
        return A;
    }
}
