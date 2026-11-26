
class Solution {
    static final long MOD = 1000000007L;

    public int countGoodNumbers(long n) {
        long e = (n + 1) / 2;
        long o = n / 2;

        long a = power(5, e);
        long b = power(4, o);

        return (int) ((a * b) % MOD);
    }

    long power(long base, long exp) {
        long result = 1;

        while (exp > 0) {
            if (exp % 2 == 1) {
                result = (result * base) % MOD;
            }

            base = (base * base) % MOD;
            exp /= 2;
        }

        return result;
    }
}
