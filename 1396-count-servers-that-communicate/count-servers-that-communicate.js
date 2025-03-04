/**
 * @param {number[][]} grid
 * @return {number}
 */
var countServers = function(grid) {
    let n = grid.length,m=grid[0].length,count=0;
    let row = new Array(n).fill(0);
    let col = new Array(m).fill(0);
    for(let i = 0 ; i < n ; i++){
        for(let j = 0 ; j < m ; j++){
            row[i]+=grid[i][j];
            col[j]+=grid[i][j];
        }
    }

    for(let i=0;i<n;i++){
        for(let j = 0 ; j < m ; j++){
            if(grid[i][j]==1 && (row[i]>1 || col[j] > 1)) count++;
        }
    }

    return count;
};