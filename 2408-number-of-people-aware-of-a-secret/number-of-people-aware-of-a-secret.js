var peopleAwareOfSecret = function(n, delay, forget) {
    let dp = new Array(n+1).fill(0);
    dp[1]=1;
    const MOD = 1000000007n;
    let share = 0n;
    for(let i=2;i<=n;i++){
        if(i-delay > 0) share = (share + BigInt(dp[i-delay]) + MOD) % MOD
        if(i-forget > 0) share = (share - BigInt(dp[i-forget]) + MOD) % MOD ;
        dp[i] = Number(share);
    }

    let know = 0n;
    for( let i = n-forget+1 ; i <=n ; i++ ){
        know = (know + BigInt(dp[i]))%MOD
    }

    return Number(know);
};