class Solution {
    public List<String> summaryRanges(int[] nums) {
         List<String> result = new ArrayList<>();
        if (nums.length == 0) return result; 

        int start = nums[0]; 

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1] + 1) { 
                result.add(start == nums[i - 1] ? String.valueOf(start) : start + "->" + nums[i - 1]);
                start = nums[i]; 
            }
        }


        result.add(start == nums[nums.length - 1] ? String.valueOf(start) : start + "->" + nums[nums.length - 1]);

        return result;
    }
}
