/**
 * @param {string} s
 * @return {string}
 */
var finalString = function(s) {
    chars = [];
    for(let i=0;i<s.length;i++){
        if(s[i]!=="i"){
            chars.push(s[i]);
        }
        else{
            chars.reverse();
        }
    }
    return chars.join("");
};