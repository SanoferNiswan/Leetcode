var islandPerimeter = function(grid) {
    let perimeter = 0, n=grid.length, m = grid[0].length;
    for(let i=0;i<n;i++){
        for(j=0;j<m;j++){
            if(grid[i][j]==1){
                if(i==0) perimeter+=1;
                if(i==n-1) perimeter+=1;
                if(j==m-1) perimeter+=1;
                if(j==0) perimeter+=1;
                if(j>0 && grid[i][j-1]!=1) perimeter+=1;
                if(j<m-1 && grid[i][j+1]!=1) perimeter+=1;
                if(i>0 && grid[i-1][j]!=1) perimeter+=1;
                if(i<n-1 && grid[i+1][j]!=1) perimeter+=1;
            }
        }
    }
    return perimeter;
};