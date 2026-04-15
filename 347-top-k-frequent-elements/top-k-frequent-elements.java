class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //store frequency
        Map<Integer,Integer> m = new HashMap<Integer,Integer>();
        for(int num:nums) m.put(num, m.getOrDefault(num, 0)+1);

        // store top k elements
        PriorityQueue<int[]> minHeap = new PriorityQueue<int[]>((a,b)->a[1] - b[1]);
        for(int key:m.keySet()){
            minHeap.add(new int[]{key, m.get(key)});

            if(minHeap.size() > k) minHeap.poll();
        }

        // store result
        int res[] = new int[k];
        int i = 0;
        while(!minHeap.isEmpty()) res[i++] = minHeap.poll()[0];

        return res;
    }
}
