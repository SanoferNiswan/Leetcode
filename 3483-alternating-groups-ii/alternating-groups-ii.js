/**
 * @param {number[]} colors
 * @param {number} k
 * @return {number}
 */
var numberOfAlternatingGroups = function (colors, k) {
    let n = colors.length, current_count = 1, result = 0;

    for (let i = 0; i < n + k - 2; ++i) {
        if (colors[i % n] !== colors[(i + 1) % n]) {
            current_count++;
        } else {
            current_count = 1;
        }
        result += (current_count >= k) ? 1 : 0;
    }

    return result;
};
