import java.math.*;
class Solution {
    public int countGoodNumbers(long n) {
        int MOD = 1_000_000_007;
        long evenCount = (n + 1) / 2;
        long oddCount = n / 2;

        BigInteger five = BigInteger.valueOf(5);
        BigInteger four = BigInteger.valueOf(4);
        BigInteger mod = BigInteger.valueOf(MOD);

        BigInteger evenWays = five.modPow(BigInteger.valueOf(evenCount), mod);
        BigInteger oddWays = four.modPow(BigInteger.valueOf(oddCount), mod);
        BigInteger result = evenWays.multiply(oddWays).mod(mod);
        return result.intValue();
    }
}
