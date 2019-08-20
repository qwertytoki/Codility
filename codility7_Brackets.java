// you can also use imports, for example:
import java.util.*;

// TIMEOUT!
// need to improve performance


class Solution {
    public int solution(String S) {
        // write your code in Java SE 8
        if(S.equals("")) return 1;
        Map<String,String> map = new HashMap<>();
        map.put("]","[");
        map.put(")","(");
        map.put("}","{");
        
        Deque<String> deque = new ArrayDeque<>();
        String[] array =  S.split("");
        for(String s:array){
            if(deque.peek()==null){
                deque.push(s);
                continue;
            }
            if(deque.peek().equals(map.get(s))){
                deque.pop();
            }else{
                deque.push(s);    
            }
        }
        return deque.size()==0?1:0;
        
    }
}