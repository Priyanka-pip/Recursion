class Solution {
    public int rob(int[] nums) {
        return helper(nums,nums.length-1);
    }

    public int helper(int[] nums , int index) {
      if(index < 0) {
        return 0;
      }
      int rob = nums[index] + helper(nums,index-2);
      int dontrob = helper(nums,index-1);
      return Math.max(rob, dontrob);
    }
}
