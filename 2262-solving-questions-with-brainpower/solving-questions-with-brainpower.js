/**
 * @param {number[][]} questions
 * @return {number}
 */
var mostPoints = function(questions) {
    let n = questions.length;
    let memo=new Array(n);
    return check(0,questions,memo);
};

var check = function(i,questions,memo){
    if(i>=questions.length) return 0;
    if(memo[i]!=null) return memo[i];
    return memo[i]=Math.max(check(i+1,questions,memo),questions[i][0]+check(questions[i][1]+i+1,questions,memo))
}