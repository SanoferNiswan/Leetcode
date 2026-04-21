class Solution {
    public int leastInterval(char[] tasks, int n) {
        int max = 0, maxCount =0;
        int freq[] = new int[26];
        for(char c:tasks){
            freq[c-'A']++;
            max = Math.max(max, freq[c-'A']);
        }
        for(int num:freq) if(num==max) maxCount++;

        int slot = (max-1) * (n+1) + maxCount;

        return Math.max(slot, tasks.length);
    }
}