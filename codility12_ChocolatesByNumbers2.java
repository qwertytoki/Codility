class Solution {
    public int solution(int N, int M) {
        //int lcm = N * M / gcd(N, M);
        //return lcm / M;
		int lcm = N / gcd(N, M);
        return lcm;
    }
    
    public int gcd(int a, int b) {
	    if(a % b == 0) return b;
	    return gcd(b,a%b);
	}
}