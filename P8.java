public class Solution {
    public int solve(int A) {
        
        int mul = 1;
        int ans = 0;
        
        while(A > 0){
            
            mul = mul * 5;
            
            if((A & 1) == 1) ans += mul;
            
            A >>= 1; 
        }
        return ans;
    }
}
