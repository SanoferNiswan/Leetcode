class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<int[]>((a,b)->b[1]-a[1]);
        for(int i = 0 ; i < points.length ; i++){
            int calc = (points[i][0] * points[i][0]) + (points[i][1] * points[i][1]);
            maxHeap.add(new int[]{i, calc});

            if(maxHeap.size() > k) maxHeap.poll();
        }

        int[][] res = new int[k][2];
        int i = 0;
        while(!maxHeap.isEmpty()){
            res[i++] = points[maxHeap.poll()[0]];
        }

        return res;
    }
}