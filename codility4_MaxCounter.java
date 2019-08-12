// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    int maxValue = 0;
    public int[] solution(int N, int[] A) {
        // write your code in Java SE 8
        int[] counters = new int[N];
        for(int i=0;i<A.length;i++){
            if(A[i]==N){
                counters = setMaxValToAll(counters);
            }else{
                counters[A[i]-1]++;
            }
            
            compareMaxValue(counters[A[i]]);
        }
        return counters;
    }
    
    private void compareMaxValue(int val){
        if(val>maxValue){
            maxValue = val;    
        }
    }
    private int[]setMaxValToAll(int[] counters){
        for(int i:counters){
           i = maxValue; 
        }
        return counters;
    }
}
