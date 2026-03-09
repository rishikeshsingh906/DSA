class Solution {
    public boolean isMonotonic(int[] nums) {
       int inc = 0, dec = 0;

        for(int i = 1; i < nums.length; i++){
            if(nums[i] > nums[i-1]) inc++;
            if(nums[i] < nums[i-1]) dec++;
        }

        return inc == 0 || dec == 0;
    }
}
