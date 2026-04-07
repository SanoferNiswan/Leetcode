class Solution {
    public String simplifyPath(String path) {
        String[] parts = path.split("/");
        Stack<String> st = new Stack<String>();

        for(String part:parts){
            if(part.equals("") || part.equals(".")) continue;

            if(part.equals("..")){
                if(!st.isEmpty()) st.pop();
            }else{
                st.push(part);
            }
        }
        StringBuilder res = new StringBuilder();

        for(String s:st) res.append('/'+s);

        return res.length()==0 ? "/" : res.toString();
    }
}