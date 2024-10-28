/**
 * @param {number[][]} matrix
 * @param {number} target
 * @return {boolean}
 */
var searchMatrix = function(matrix, target) {
    let x=false;
    matrix.forEach((row,rIndex)=>{
        row.forEach((col,colIndex)=>{
            if(col===target) x=true;
            }
            )
    })
    return x;
};