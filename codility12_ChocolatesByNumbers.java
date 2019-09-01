import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int N, int M) {
        // write your code in Java SE 8
        /**
         * Reoccurrence logic
         * if next point is empty,return the eaten.
         * the parameter should be, 
         * 1 your current place (int index)
         * 2 how they proceed (int move)
         * 3 which places are empty (List<Integer> eatenList)
         */
        return M*N/getGCD(N,M);
    }
    private int getGCD(int N,int M){
        if(N<M)getGCD(M,N);
        if(N % M ==0)return M;
        getGCD(N, N % M);
    }
    private int eat(int place,int move,int length,List<Integer>eatenList){
        if(eatenList.contains(place)){
            return eatenList.size();
        }
        eatenList.add(place);
        place += move;
        if(place>=length){
            place = place%length;
        }
        return eat(place, move, length, eatenList);
    }
}
