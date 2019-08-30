
// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] H) {
        // write your code in Java SE 8
        /**
         * use queue-> cannot! list is better. create fundation if next int is lower
         * than foundation,then current queue is finish if next int is same of contents
         * of queue, then 0 count.
         */
        Deque<Integer> deque = new ArrayDeque<>();
        int count = 0;
        for(int i:H){
            if(deque.size() == 0){
                deque.push(i);
                count++;
                continue;
            }
            while(deque.size()!=0 && deque.peek()>i){
                deque.poll();
            }
            if(deque.size()!=0 &&deque.peek()==i){
                continue;
            }
            deque.push(i);
            count++;
        }
        
        return count;
    }
}
