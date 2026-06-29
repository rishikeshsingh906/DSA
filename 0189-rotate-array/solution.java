class Solution {
    public void rotate(int[] nums, int k) {
        int n= nums.length;
        k=k%n;
        isReverse(nums,0,n-1);
        isReverse(nums,0, k-1);
        isReverse(nums,k,n-1);
        System.out.print(nums);

        
    }
public static void isReverse(int [] nums,int left, int right){
    
    while(left < right){
        int temp = nums[left];
        nums[left]= nums[right];
        nums[right]= temp;
        left++;
        right--;
    }
}
    
}
