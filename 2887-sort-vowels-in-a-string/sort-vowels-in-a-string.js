var sortVowels = function (s) {
    let vowel = [];
    chars = s.split("");
    for (let i in s) {
        let char = chars[i].toLowerCase();
        if (char == "a" || char == 'e' || char == 'i' || char == 'o' || char == 'u') {
            vowel.push(chars[i]);
        }
    }
    vowel.sort();
    let j=0;
    for (i in s) {
        let char = s[i].toLowerCase();
        if (char == "a" || char == 'e' || char == 'i' || char == 'o' || char == 'u') {
            chars[i] = vowel[j++];
        }
    }
    return chars.join("");
};