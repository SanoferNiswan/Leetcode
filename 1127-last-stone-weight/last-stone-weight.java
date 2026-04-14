class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>((a,b)->b-a);
        for(int stone:stones) maxHeap.add(stone);

        while(maxHeap.size()>1){
            int f = maxHeap.poll(), s = maxHeap.poll();
            if(f<s){
                maxHeap.add(s-f);
            }else if(f>s) maxHeap.add(f-s);
        }

        return maxHeap.isEmpty() ? 0 : maxHeap.poll();
    }
}