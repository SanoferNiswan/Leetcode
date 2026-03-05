/**
 * @param {string} s
 * @return {number}
 */
var minOperations = function(s) {
    let possibility1 = 0, possibility2= 0;
    for(let i = 0 ;i<s.length;i++){
        //1 if - 0 , else - 1
        //2 if-1 else-0
        if(i%2==0){
            if(s[i]=='0'){
                possibility2++;
            }else{
                possibility1++;
            }
        } else {
            if(s[i]=='0'){
                possibility1++;
            }else possibility2++;
        }
    }

    return Math.min(possibility2,possibility1);
};