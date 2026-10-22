class Solution {
    public int kthGrammar(int n, int k) {
        // Base case: First row always has '0' at the 1st position
        if (n == 1) {
            return 0;
        }
        
        int parent = kthGrammar(n - 1, (k + 1) / 2);
        
        if (k % 2 == 0) {
            return 1 - parent;
        } 
        else {
            return parent;
        }
    }
}