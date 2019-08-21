// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A, int[] B) {
        // write your code in Java SE 8
        int count = 0;
        Deque<Integer> deque = new ArrayDeque<>();
        for(int i=0;i<A.length;i++){
            boolean isDown = B[i]==1;
            int power = A[i];
            if(isDown){
                deque.push(power);
            }else{
                while(deque.size()>0){
                    if(deque.peek()<power){
                        deque.poll();
                    }else{
                        break;
                    }
                }
                if(deque.size()==0)count++;                      
            }
        }
        return deque.size()+count;
    }
}
