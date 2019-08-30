
class Solution {
    public int solution(int N) {
        int count = 0;
        int i =0;
        while(i*i<N){
            if(N%i==0)count+=2;
            i++;
        }
        if(i*i==N)count++; 
        return count;
    }
}
