class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        Map<Character,Integer> m = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(m.containsKey(s.charAt(i))){
                m.put(s.charAt(i), m.get(s.charAt(i))+1);
            }else{
                m.put(s.charAt(i),1);
            }
        }
        System.out.println("hm:"+m);
        for(int i=0;i<t.length();i++){
            if(m.containsKey(t.charAt(i))){
                int count = m.get(t.charAt(i));
                if(count > 1) m.put(t.charAt(i),count-1);
                else m.remove(t.charAt(i));
            }else{
                return false;
            }
        }
        return true;
    }
}