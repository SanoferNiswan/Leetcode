class Solution {
    public long mostPoints(int[][] questions) {
        int n = questions.length;
        Long memo[] = new Long[n];
        return check(0,memo,questions);
    }
    public long check(int i,Long[] memo,int[][] questions){
        if(i>=questions.length) return 0;
        if(memo[i]!=null) return memo[i];
        return memo[i]=Math.max(check(i+1,memo,questions),questions[i][0]+check(questions[i][1]+i+1,memo,questions));
    }
}