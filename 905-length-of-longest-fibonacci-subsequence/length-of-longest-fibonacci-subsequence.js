/**
 * @param {number[]} arr
 * @return {number}
 */
var lenLongestFibSubseq = function (arr) {
    let s = new Set(arr);
    let res = 0, count = 0;
    for (let i = 0; i < arr.length; i++) {
        for (let j = i + 1; j < arr.length - 1; j++) {
            let first = arr[i];
            let sec = arr[j];
            count = 2;
            while (true) {
                if (s.has(first + sec)) {
                    count++;
                    res = Math.max(count, res);
                } else {
                    break;
                }
                let temp = first + sec;
                first = sec;
                sec = temp;
            }
        }
    }
    return res;
};