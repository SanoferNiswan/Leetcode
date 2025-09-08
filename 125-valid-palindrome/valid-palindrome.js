/**
 * @param {string} s
 * @return {boolean}
 */
var isPalindrome = function(s) {
    let left=0;right=s.length-1;
    s = s.toLowerCase();
    while(left<right){
        while(left<right && !isAlphaNumeric(s[left])) left++;
        while(left<right && !isAlphaNumeric(s[right])) right--;
        if(s[left]!==s[right]) return false;
        left++;
        right--;
    }
    return true;
};

const isAlphaNumeric = (char) => {
    let code = char.charCodeAt(0);
    return ((code>=97 && code <= 122) || (code>=48 && code<=57))
}