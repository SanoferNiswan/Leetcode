/**
 * @param {string} word
 * @return {boolean}
 */
var isValid = function(word) {
    return word.length>2 && /^[a-zA-Z0-9]+$/.test(word) && /[aeiou]/i.test(word) && /[b-df-hj-np-tv-z]/i.test(word);
};