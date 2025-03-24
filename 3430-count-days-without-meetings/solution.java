class Solution {
    public int countDays(int days, int[][] meetings) {
          Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));

        
        int availableDays = 0;
        int lastEnd = 0; 

        for (int[] meeting : meetings) {
            int start = meeting[0];
            int end = meeting[1];

           
            if (start > lastEnd + 1) {
                availableDays += start - lastEnd - 1;
            }
            
            lastEnd = Math.max(lastEnd, end);
        }

        
        if (lastEnd < days) {
            availableDays += days - lastEnd;
        }

        return availableDays;
    }
}
