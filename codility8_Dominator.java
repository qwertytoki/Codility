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
        return getMaxIndex(map,A.length/2);
    }
    private int getMaxIndex(Map<Integer,Integer>map,int needForDominant){
        int maxCount =0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue()>maxCount){
                maxCount = entry.getValue();
                if(maxCount>needForDominant){
                    return entry.getKey();
                }
            }
        }
        return -1;
    }
}
