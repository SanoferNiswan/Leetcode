/**
 * @param {string[]} words
 * @return {string[]}
 */
var stringMatching = function(words) {
    let a=[];
    for(let i = 0 ; i < words.length ; i++ ){
        for(let j = 0 ; j < words.length ; j++ ){
            if(i!=j && words[i].includes(words[j]) && !a.includes(words[j])){
                a.push(words[j]);
            }
        }
    }
    return a;
};