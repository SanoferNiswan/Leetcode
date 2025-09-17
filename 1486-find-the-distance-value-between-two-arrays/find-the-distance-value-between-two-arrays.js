var findTheDistanceValue = function(arr1, arr2, d) {
    let count = 0,valid;
    for(let i = 0 ; i < arr1.length ; i++){
        for(let j = 0 ; j < arr2.length ; j++){
            valid = true;
            if(Math.abs(arr1[i]-arr2[j])<=d){
                valid = false;
                break;
            }
        }
        if(valid) count++;
    }
    return count;
};