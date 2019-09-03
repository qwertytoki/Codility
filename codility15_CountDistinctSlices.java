// you can also use imports, for example:
import java.util.*;

// need to improve performance
// N(O^2)  too slow
class Solution {
    public int solution(int M, int[] A) {
        /**
         * use arraylist 
         * if list doesn't contains next number,count++
         * if list contains number, break and go next
         * return count
         */
        int count = 0;
        for(int i=0;i<A.length;i++){
            List<Integer> list = new ArrayList<>();
            for(int j=i;j<A.length;j++){
                if(!list.contains(A[j])){
                    list.add(A[j]);
                    count++;
                }else{
                    break;
                }
            }
        }
        return count;
    }
}
