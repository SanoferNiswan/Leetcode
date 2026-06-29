class Solution {
    public List<Integer> spiralOrder(int[][] m) {
        List<Integer> a=new ArrayList<>();
        int left = 0, top = 0, bottom = m.length-1, right = m[0].length-1;

        while(left <= right && top <= bottom){
            for(int i=left; i<=right; i++){
                a.add(m[top][i]);
            }
            top++;

            for(int i=top; i<=bottom; i++){
                a.add(m[i][right]);
            }
            right--;

            if(bottom>=top){
                for(int i=right; i>=left; i--){
                a.add(m[bottom][i]);
            }
            bottom--;
            }

            if(right>=left){
                for(int i=bottom; i>=top; i--){
                a.add(m[i][left]);
            }
            left++;
            }
        }
        return a;
    }
}