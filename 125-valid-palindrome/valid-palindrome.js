/**
 * @param {string} s
 * @return {boolean}
 */
var isPalindrome = function(s) {
    s=s.toLowerCase();
    let str=""
    for(let i=0;i<s.length;i++){
        let char = s[i].charCodeAt(0);
        if((char>=97 && char<=122) || (char>=48 && char<=57)){
            str+=s[i];
        }
    }
    let left = 0,right = str.length-1;
    while(left<right){
        if(str[left]!=str[right]){
            return false;
        }
        left++;
        right--;
    }
    return true;
};