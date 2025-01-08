/**
 * @param {string[]} words
 * @return {number}
 */
var countPrefixSuffixPairs = function(words) {
    var count = 0 ;
    for(let i = 0 ; i < words.length-1 ; i++){
        for(let j = i+1 ; j < words.length ; j++){
            if(isPrefixAndSuffix(words[i],words[j])){
                count++;
            }
        }
    }
    return count;
};

var isPrefixAndSuffix = function(str1,str2){
    return str2.startsWith(str1) && str2.endsWith(str1);
}