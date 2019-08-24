
// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] H) {
        // write your code in Java SE 8
        /**
         * use queue-> cannot! array is better. create fundation if next int is lower
         * than foundation,then current queue is finish if next int is same of contents
         * of queue, then 0 count.
         */
         
        List<Integer> list = new ArrayList<>();
        int count = 0;
        for (int i : H) {
            if (list.size() == 0) {
                list.add(i);
            } else if (list.get(0) > i) {
                list.clear();
                list.add(i);
            } else if (!list.contains(i)) {
                list.add(i);
            } else {
                continue;
            }
            count++;
        }
        return count;
    }
}
