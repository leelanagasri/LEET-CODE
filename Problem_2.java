class Solution {
    public int check(int n, int k,int[] nums2){
        for(int i=k;i<nums2.length;i++){
            if(nums2[i]>n){
                return nums2[i];
            }
        }
        return -1;
    }
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums2.length;i++){
            hm.put(nums2[i],check(nums2[i],i,nums2));
        }
        for(int i=0;i<nums1.length;i++){
            nums1[i] = hm.get(nums1[i]);
        }
        return nums1;
    }
}
