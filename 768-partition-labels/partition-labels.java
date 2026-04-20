class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> res = new ArrayList<Integer>();

        int lastInd[] = new int[26];

        for(int i = 0 ; i < s.length() ; i++) lastInd[s.charAt(i)-'a'] = i;

        int end = 0 , start = 0;
        for(int i = 0 ; i < s.length() ; i++){
            end = Math.max(end, lastInd[s.charAt(i)-'a']); // store current end if greater

            if(i==end){
                res.add(end-start+1);
                start = i+1;
            }
        }
        return res;
    }
}