class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int f = 0, s = 0;
        int[] arr = new int[nums.length+2];
        for(int i=0;i<nums.length;i++){
            if(arr[nums[i]] == 0){
                arr[nums[i]] = nums[i];
            }
            else if(f == 0){
                f = nums[i];
            }
            else{
                s = nums[i];
            }
        }
        return new int[]{f,s};
    }
}
