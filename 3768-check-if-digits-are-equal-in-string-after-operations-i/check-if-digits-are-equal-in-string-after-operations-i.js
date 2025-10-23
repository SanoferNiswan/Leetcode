/**
 * @param {string} s
 * @return {boolean}
 */
var hasSameDigits = function(s) {
    while(s.length!=2){
        let temp = '';
        for(let i=1;i<s.length;i++){
            temp+=String((Number(s[i-1])+Number(s[i]))%10)
        }
        s=temp;
    }
    if(s.length==2) return s[0]==s[1];
    return false;
};