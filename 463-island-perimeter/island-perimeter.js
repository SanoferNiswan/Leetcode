var islandPerimeter = function (grid) {
    let perimeter = 0, n = grid.length, m = grid[0].length;
    for (let i = 0; i < n; i++) {
        for (let j = 0; j < m; j++) {
            if (grid[i][j] == 1) {
                perimeter += 4;
                if (i > 0 && grid[i - 1][j] == 1) perimeter -= 2;
                if (j > 0 && grid[i][j - 1] == 1) perimeter -= 2;
            }
        }
    }
    return perimeter;
};