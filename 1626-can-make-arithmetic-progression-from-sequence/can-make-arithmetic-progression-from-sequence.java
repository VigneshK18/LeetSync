class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        int i = 0;
        int j =  1;
        int n = arr.length;
        Arrays.sort(arr);
        int diff = Math.abs(arr[i]-arr[j]);
        while(j<n){
            if(Math.abs(arr[i]-arr[j])!= diff){
                return false;
            }
            i++;
            j++;
        }
        return true;
    }
}