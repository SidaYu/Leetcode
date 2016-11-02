public class Solution {
    public int numWays(int n, int k) {
        if(n <= 0) return 0;
        if(n == 1) return k;
        int diffColorCounts = k*(k-1);
        int sameColorCounts = k;
        for(int i = 2; i < n; i++){
            int tmp = diffColorCounts;
            diffColorCounts = (diffColorCounts + sameColorCounts) * (k-1);
            sameColorCounts = tmp;
        }
        return diffColorCounts + sameColorCounts;
    }
}