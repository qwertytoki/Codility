import java.util.Arrays;

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        for(int i =0; i<A.length;i++){
            if(A[i]!=i+1){
                return i+1;
            }
        }
        return A.length+1;
    }
    private int[] performanceTest(){
        int[] array = new int[100000];
        for(int i=0;i<array.length;i++){
            array[i] = i+1;
        }
        // you can change for test
        array[89794] = 100001;
        return array;
    }
}

