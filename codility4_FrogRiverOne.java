// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int X, int[] A) {
        // write your code in Java SE 8
        // PriorityQueue<Integer> pq = new PriorityQueue<>();
        List<Integer>intList = new ArrayList<>();
        int position = 0;
        for(int i=0;i<A.length;i++){
            intList.add(A[i]);
            for(int j=position;j<intList.size();j++){
                if(intList.contains(j+1)){
                    position++;
                }
                if(position >= X){
                    return i;
                }
            }
                
        }
        return -1;
    }
}
