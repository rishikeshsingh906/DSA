class Solution {
    public int maxArea(int[] height) {
        
        int left =0;
        int right = height.length -1;
        int water =0;

        while( left < right){
            int length = right -left;
            int bredth =Math.min(height[left], height[right]);
            water = Math.max(water , length * bredth);

        if(height[left] < height[right]){
            left++;
        }else{
                right--;
            }
        }   
        return water;
    }
}
