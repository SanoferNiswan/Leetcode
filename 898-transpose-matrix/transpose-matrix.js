/**
 * @param {number[][]} matrix
 * @return {number[][]}
 */
var transpose = function(matrix) {
    let n = matrix.length,m=matrix[0].length;
    let result = new Array(m).fill(0).map(()=>new Array(n))
    for(let i=0;i<m;i++){
        for(let j=0;j<n;j++){
            result[i][j] = matrix[j][i];
        }
    }
    return result;
};