// you can also use imports, for example:
import java.util.*;

class Solution {
    public int solution(String S) {
        // write your code in Java SE 8
        if(S.equals("")) return 1;
        Map<Character,Character> map = new HashMap<>();
        map.put(']','[');
        map.put('}','{');
        map.put(')','(');
        
        Deque<Character> deque = new ArrayDeque<>();
        for(int i=0;i<S.length();i++){
            char c = S.charAt(i);
            if(deque.peek()==null){
                deque.push(c);
                continue;
            }
            if(deque.peek()==map.get(c)){
                deque.pop();
            }else{
                deque.push(c);    
            }
        }
        return deque.size()==0?1:0;
    }
}