public class Solution {
    public String convertToTitle(int A) {
        
        StringBuilder ans = new StringBuilder("");
        while(A > 0){
            A--;
            ans.append((char) ('A' + (A % 26)) );
            A /= 26;
        }
        ans.reverse();
        return ans.toString();
    }
}
