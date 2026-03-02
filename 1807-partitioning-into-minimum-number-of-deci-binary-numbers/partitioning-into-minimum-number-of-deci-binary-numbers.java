class Solution {
    public int minPartitions(String s) {
           char[] ch =s.toCharArray();
        Arrays.sort(ch);

      char ch1 =  ch[ch.length-1];
      
        return Integer.parseInt(String.valueOf(ch1));
    }
}