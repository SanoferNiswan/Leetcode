/**
 * @param {number} n
 * @return {boolean}
 */
var checkPowersOfThree = function(n) {
    let count = 0, product = 1, sum = 0 ;
    while(n>0){
        if(n%3==2) return false;
        n=Math.floor(n/3);
    }
    return true;
};