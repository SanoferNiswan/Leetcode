var calPoints = function (operations) {
    let temp = [], sum = 0, j = -1;
    for (let i = 0; i < operations.length; i++) {
        if (operations[i] == "C") temp.splice(j--, 1);
        else if (operations[i] == "D") {
            temp.push(temp[j] * 2);
            j++;
        }
        else if (operations[i] == "+") {
            temp.push(temp[j] + temp[j - 1]);
            j++;
        } else {
            temp.push(Number(operations[i]))
            j++;
        }
    }
    let res = temp.reduce((acc, curr) => acc += curr, 0);
    return Number(res);


};