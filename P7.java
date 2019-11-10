public class Solution {
    public int solve(int A, int B, int C, int D, int E, int F, int G, int H) {
    
        if(C <= E || A >= G) return 0;
        
        if(F >= D || B >= H) return 0;
        
        return (Math.min(C,G) - Math.max(A,E)) * (Math.min(H,D) - Math.max(B,F)); 
        
    }
}
