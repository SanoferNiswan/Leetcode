/**
 * @param {string} sentence
 * @return {boolean}
 */
var isCircularSentence = function(sentence) {
    let a=sentence.split(' ');
    var n=a.length;
    if(n<2){
        if(sentence[0]===sentence[sentence.length-1]){
             return true;
        }
        return false;
    }
    if(a[0][0]!==a[n-1][a[n-1].length-1]) return false;
    for(let i=0;i<a.length-1;i++){
         let len=a[i].length;
         let x=a[i];
         let y=a[i+1];
         console.log(x[len-1],y[0]);
         if(x[len-1]!==y[0]) return false;
    }
    return true;
};