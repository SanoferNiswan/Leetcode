var doesAliceWin = function(s) {
    let vowelCount = 0,vowel="aeiou";
    for(let i = 0 ; i < s.length ; i++){
        let c = s[i];
        if(vowel.includes(c)) vowelCount+=1;
    }

    if(vowelCount == 0) return false;
    return true;
};