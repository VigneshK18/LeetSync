class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> hm =new HashMap<>();
        for(int i=0;i<n;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        int ans = -1;
        for(int macha:hm.keySet()){
            if(hm.get(macha)>n/2){
                return macha;
            }
        }
        return ans;
    }
}