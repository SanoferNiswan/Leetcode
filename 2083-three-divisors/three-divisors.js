/**
 * @param {number} n
 * @return {boolean}
 */
var isThree = function(n) {
    let count =2;
    for(let i=2;i<n;i++){
        if(n%i==0) count++;
    }
    if(count===3) return true;
    return false;
};