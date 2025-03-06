/**
 * @param {number[][]} grid
 * @return {number[]}
 */
var findMissingAndRepeatedValues = function(grid) {
    let n=grid.length,m=grid[0].length;
    let a=new Array(n*m+1).fill(0);
    let res=[];
    for(let i=0;i<n;i++){
        for(let j=0;j<m;j++){
            if(++a[grid[i][j]]>1){
                res.push(grid[i][j]);
            }
        }
    }
    for(let i=1;i<=n*m;i++){
        console.log(a[i])
        if(a[i]==0){
            res.push(i);
            return res;
        }
    }
    return new Array();
    
};