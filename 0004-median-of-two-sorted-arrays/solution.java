class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       List<Integer> arr = new ArrayList<>();

        
        for (int num : nums1) {
            arr.add(num);
        }
        for (int num : nums2) {
            arr.add(num);
        }

        
        Collections.sort(arr);

        int n = arr.size();


        if (n % 2 == 1) {
            return arr.get(n / 2);
        } else { 
            int med1 = arr.get(n / 2);
            int med2 = arr.get((n / 2) - 1);
            return (med1 + med2) / 2.0;
        
    }
    }
    }

