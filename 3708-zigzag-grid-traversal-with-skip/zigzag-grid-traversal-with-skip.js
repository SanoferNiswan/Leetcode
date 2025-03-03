/**
 * @param {number[][]} grid
 * @return {number[]}
 */
var zigzagTraversal = function(grid) {
    let n=grid.length;
    let m=grid[0].length;
    const result = [];
    for(let i = 0 ; i < n ; i++){
        if(i%2==0){
            for(let j = 0 ; j < m ; j+=2) result.push(grid[i][j]);
        }
        else{
            let j=m%2==0?m-1:m-2;
            for(; j >= 0 ; j-=2) result.push(grid[i][j]);
        }
    }
    return result;
};