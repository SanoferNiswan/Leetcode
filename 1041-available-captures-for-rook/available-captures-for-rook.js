/**
 * @param {character[][]} board
 * @return {number}
 */
var numRookCaptures = function(board) {
    var i,j,f=0;
    // check for rook
    for(i=0;i<board.length;i++){
        for(j=0;j<board[0].length;j++){
            if(board[i][j]=='R'){
                f=1;
                break;
            }
        }
        if(f==1) break;
    }
    var count=0;

    // check left
    for(let x=j-1;x>=0;x--){
        if(board[i][x]=='p'){
            count++;
            break;
        }
        else if(board[i][x]=='B') break;
    }

    // check right
    for(let x=j+1;x<8;x++){
        if(board[i][x]=='p'){
            count++;
            break;
        }
        else if(board[i][x]=='B') break;
    }

    // check bottom
    for(let x=i+1;x<8;x++){
        if(board[x][j]=='p'){
            count++;
            break;
        }
        else if(board[x][j]=='B') break;
    }

    // check top
    for(let x=i-1;x>=0;x--){
        if(board[x][j]=='p'){
            count++;
            break;
        }
        else if(board[x][j]=='B') break;
    }
    return count;
};