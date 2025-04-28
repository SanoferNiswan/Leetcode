/**
 * @param {number[]} prices
 * @return {number}
 */
var getDescentPeriods = function(prices) {
    let count = prices.length,left=0;
    for(let right=0;right<prices.length-1;right++){
        if(prices[right+1]+1!=prices[right]){
            left=right+1;
        }else{
            count+=right-left+1;
        }
    }
    return count;
};