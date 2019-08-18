// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        List<Integer> list = new ArrayList<>();
        for(int i:A){
            if(i>0&&!list.contains(i))
            list.add(i);
        }
        Collections.sort(list);
        for(int i=0;i<list.size();i++){
            if(list.get(i)!=i+1){
                return i+1;
            }
        }
        return list.size()+1;
    }
}
