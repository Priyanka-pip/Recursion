class Solution {
    public int tribonacci(int n) {
        if(n==2)
           return 1;
        if(n<=1)
           return n;
        return tribonacci(n-1)+tribonacci(n-2)+tribonacci(n-3);
    }
}
