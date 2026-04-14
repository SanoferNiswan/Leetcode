class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> m = new HashMap<String, List<String>>();

        for(String str:strs){
            int[] count = new int[26];

            for(char c:str.toCharArray()) count[c-'a']++;

            String key = Arrays.toString(count);

            m.putIfAbsent(key, new ArrayList<String>());
            m.get(key).add(str);
        }
        return new ArrayList<>(m.values());
    }
}