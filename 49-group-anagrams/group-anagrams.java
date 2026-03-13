class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,ArrayList<String>> m = new HashMap<String,ArrayList<String>>();
        List<List<String>> res = new ArrayList<List<String>>();
        for(String str:strs){
            char[] c = str.toCharArray();
            Arrays.sort(c);
            String temp = new String(c);
            ArrayList<String> al = m.containsKey(temp)?m.get(temp):new ArrayList<String>();
            al.add(str);
            m.put(temp,al);
        }

        for(Map.Entry<String,ArrayList<String>> entry:m.entrySet()){
            List<String> l = new ArrayList<String>();
            for(String s:entry.getValue()){
                l.add(s);
            }
            res.add(l);
        }

        return res;
    }
}