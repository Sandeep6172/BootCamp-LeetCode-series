class Solution {
    public int numOfWays(int n) {
         long MOD = 1_000_000_007;
        long aba = 6;
        long abc = 6;
        for (int i = 2; i <= n; i++) {
            long nextAba = (aba * 3 + abc * 2) % MOD;
            long nextAbc = (aba * 2 + abc * 2) % MOD;
            aba = nextAba;
            abc = nextAbc;
        }
        return (int) ((aba + abc) % MOD);
    }
}
