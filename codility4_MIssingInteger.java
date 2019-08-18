// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Queue<Integer> pq = new PriorityQueue<>();
        for(int i:A){
            if(i>0){
                pq.add(i);
            }
        }
        
        for(int i=0;i<pq.length;i++){
            if(pq.peek()!=i+1){
                return pq.peek();
            }
            pq.poll();
        }
        return 0;
    }
}
