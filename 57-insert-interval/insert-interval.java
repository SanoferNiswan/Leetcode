class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> res = new ArrayList<int[]>();
        int i = 0, n = intervals.length;
        
        // phase 1 --> no overlapping
        while(i<n && intervals[i][1] < newInterval[0]){
            res.add(intervals[i]);
            i++;
        }

        // phase 2 --> handle overlapping
        while(i<n && intervals[i][0] <= newInterval[1]){
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }

        res.add(newInterval);

        // phase 3 --> add remaining
        while(i<n){
            res.add(intervals[i++]);
        }

        return res.toArray(new int[res.size()][2]);
    }
}