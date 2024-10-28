/**
 * @param {number[][]} matrix
 * @param {number} target
 * @return {boolean}
 */
var searchMatrix = function(matrix, target) {
    for(let i of matrix){
        for(let j of i){
            if(j===target){
                return true;
            }
        }
    }
    return false;
};