/**
 * @param {string} s
 * @return {string}
 */
var makeFancyString = function(s) {
    if(s.length<3) return s;
    var str=[];
    let count=1;
    str.push(s.charAt(0));
    for(let i=1;i<s.length;i++){
        if(s.charAt(i)===s.charAt(i-1)){
            count++;
        }
        else count=1;
        if(count<3) str.push(s.charAt(i));
    }
    return str.join('');
};