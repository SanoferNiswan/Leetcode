/**
 * @param {number[]} candies
 * @param {number} k
 * @return {number}
 */
var maximumCandies = function (candies, k) {
    let low = 0, high = Math.max(...candies);
    while (low < high) {
        let mid = Math.ceil((low + high) / 2);
        if (isEnough(mid)) low = mid;
        else high = mid - 1;
    }
    return low;

    function isEnough(amount) {
        let count = 0;
        for (let i = 0; i < candies.length; i++) {
            count += Math.floor(candies[i] / amount);
        }
        return count >= k;
    }
};