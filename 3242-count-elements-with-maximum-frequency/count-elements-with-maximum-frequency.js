var maxFrequencyElements = function(nums) {
    let map = new Map();
    let max = 0;
    for(let i=0;i<nums.length;i++){
        if(map.has(nums[i])){
            let sum = map.get(nums[i])+1;
            map.set(nums[i],sum);
            max = Math.max(max,sum);
        }else{
            map.set(nums[i],1);
            max = Math.max(max,1);
        }
    }

    console.log(map);

    let res = 0;

    for(let [key,value] of map){
        console.log(map.get(key),max);
        if(map.get(key)==max){
            res+=value;
        }
    }

    return res;

};