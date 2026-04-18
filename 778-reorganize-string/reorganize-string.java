class Solution {
    public String reorganizeString(String s) {
        int freq[] = new int[26];
        for(int i = 0 ; i < s.length() ; i++) freq[s.charAt(i)-'a']++;

        PriorityQueue<int[]> maxHeap = new PriorityQueue<int[]>((a,b)->b[1] - a[1]);
        for(int i = 0 ; i < 26 ; i++){
            if(freq[i]>0) maxHeap.add(new int[]{i, freq[i]});
        }

        StringBuilder res = new StringBuilder();

        while(maxHeap.size()>=2){
            int[] first = maxHeap.poll();
            int[] second = maxHeap.poll();

            res.append((char)(first[0]+'a'));
            res.append((char)(second[0]+'a'));

            if(--first[1]>0) maxHeap.add(first);
            if(--second[1]>0) maxHeap.add(second);
        }

        if(!maxHeap.isEmpty()){
            int[] curr = maxHeap.poll();
            if(curr[1]>1) return "";
            res.append((char)(curr[0]+'a'));
        }

        return res.toString();
    }
}