// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:A){
            if(map.get(i)!=null){
                int count = map.get(i)+1;
                map.put(i,count);
            }else{
                map.put(i,1);
            }
        }
        return getMaxCount(map);
    }
    private int getMaxCount(Map<Integer,Integer>map){
        int maxCount = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            
            maxCount = Math.max(entry.getValue(), maxCount);
        }
        return maxCount;
    }
}
