class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int right = n-1;
        int left = 0;

        while(right>left){
            if(numbers[right]+numbers[left]==target){
                return new int[]{left+1,right+1};
            }else if(numbers[right]+numbers[left]>target){
                right--;
            }else{
                left++;
            }
        }
        return new int[]{-1,-1};
    }
}