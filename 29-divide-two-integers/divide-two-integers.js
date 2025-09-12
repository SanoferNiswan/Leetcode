var divide = function(dividend, divisor) {
    if(dividend==-2147483648 && divisor==-1) return 2147483647;
    let negative = dividend < 0 ^ divisor < 0;
    dividend = Math.abs(dividend);
    divisor = Math.abs(divisor);

    return negative?-1*Math.floor(dividend/divisor):Math.floor(dividend/divisor);
};