
import java.util.*;
class Solution {
    public int solution(int M, int[] A) {
        // write your code in Java SE 8
        /**
         * this is the permutation problem
         * add xPx patterns while the number is not duplicated.
         * in other words, add own index patterns if it's not duplicated. 
         */
        //  map contains his number and index
        final int LIMIT = 1000000000;
        Map<Integer,Integer>map =  new HashMap<>();
        
        int count = 0;
        int index = 0;
        for(int i:A){
            if(map.get(i)==null){
                index++;
            }else{
                index = 1;
                map = new HashMap<>();
            }
                count += index;
                map.put(i,index);
                if(count>=LIMIT){
                    return LIMIT;
                }
        }
        return count;
    }
}
