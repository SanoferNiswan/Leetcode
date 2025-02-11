/**
 * @param {string} s
 * @param {string} part
 * @return {string}
 */

var removeOccurrences = function(s,part){
    while(true){
        let index = -1;
        for(let i = 0 ; i <= s.length-part.length;i++){
            let match = true;
            for(let j = 0;j<part.length;j++){
                if(s[i+j]!==part[j]){
                    match=false;
                    break;
                }
            }
            if(match){
                index=i;
                break;
            }
        }

        if(index===-1) break;

        let newstr="";
        for(let i=0;i<s.length;i++){
            if(i>=index && i<index+part.length) continue;
            newstr+=s[i];
        }

        s=newstr;
    }
    return s;
}
