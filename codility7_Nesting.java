
// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(String S) {
        // write your code in Java SE 8
        Deque<Character> deque = new ArrayDeque<>();
        for(int i=0;i<S.length();i++){
            Character c =  S.charAt(i);
            if(c=='('){
                deque.push(c);
            }else if(deque.size()==0){
                return 0;
            }else{
                deque.poll();
            } 
        }
        return deque.size()==0?1:0;
    }
}
