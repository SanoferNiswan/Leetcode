/**
 * @param {string} s
 * @return {number}
 */
var numberOfSubstrings = function(s) {
    let ch = s.split('');
    let abc = [-1, -1, -1];
    for (let i = 0; i < 3; i++) {
        abc[i] = -1;
    }
    let count = 0, right = 0;
    while (right < ch.length) {
        abc[ch[right].charCodeAt(0) - 'a'.charCodeAt(0)] = right;
        let minIndex = Math.min(...abc);
        count += (minIndex + 1);
        right++;
    }
    return count;
};