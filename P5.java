public class Solution {
    public int trailingZeroes(int A) {
        return A == 0 ? 0 : A/5 + trailingZeroes(A/5);
    }
}
