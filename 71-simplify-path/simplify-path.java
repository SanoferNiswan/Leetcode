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
        StringBuilder sb = new StringBuilder();

        for(String s:st){
            sb.append('/'+s);
        }

        return sb.length()==0 ? "/" : sb.toString();
    }
}