class Solution {
    public int maxProduct(int[] nums) {

  
    int maxSoFar = nums[0];    
        int maxHere = nums[0];     
        int minHere = nums[0];     
        
        for(int i = 1; i < nums.length; i++) {
            
            int temp = maxHere;
            
            
            maxHere = Math.max(nums[i], 
                     Math.max(maxHere * nums[i], minHere * nums[i]));
            
            
            minHere = Math.min(nums[i], 
                     Math.min(temp * nums[i], minHere * nums[i]));
            
            
            maxSoFar = Math.max(maxSoFar, maxHere);
        }
        
        return maxSoFar;
}
        
    
}
