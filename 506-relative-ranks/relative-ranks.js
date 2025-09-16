var findRelativeRanks = function(score) {
    let s = {},scores=JSON.parse(JSON.stringify(score)),res=[];
    console.log(scores)
    score.sort((a,b)=>b-a);
    for(let i=0;i<score.length;i++){
        s[score[i]] = i+1;
    }
    for(let i=0;i<scores.length;i++){
        let val;
        if(s[scores[i]]==1) val="Gold Medal";
        else if(s[scores[i]]==2) val="Silver Medal";
        else if(s[scores[i]]==3) val="Bronze Medal";
        else val=String(s[scores[i]]);
        res.push(val);
    }

    return res;
};