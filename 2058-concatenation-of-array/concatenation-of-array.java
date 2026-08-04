class Solution {
    public int[] getConcatenation(int[] nums) {
        int answer[] = new int[2*nums.length];
        int index = nums.length;
        for(int i = 0; i<nums.length;i++){
            answer[i] = nums[i];
             answer[index] = nums[i];
            index++;
        }
        return answer;
    }
}