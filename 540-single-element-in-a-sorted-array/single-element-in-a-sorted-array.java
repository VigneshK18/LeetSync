class Solution {
    public int singleNonDuplicate(int[] nums) {
        int sol = 0;
        for(int n: nums){
            sol = sol^n;
        }
        return sol;
    }
}