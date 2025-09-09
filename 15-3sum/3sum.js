/**
 * @param {number[]} nums
 * @return {number[][]}
 */
var threeSum = function (nums) {
    nums.sort((a, b) => a - b);
    let result = [];
    console.log(nums)
    for (let i = 0; i < nums.length - 2; i++) {
        if (i > 0 && nums[i] === nums[i - 1]) continue;
        let left = i + 1, right = nums.length - 1;

        while (left < right) {
            let sum = nums[i] + nums[left] + nums[right]; // prevent duplicate triplet calc
            if (sum == 0) {
                result.push([nums[i], nums[left], nums[right]]);

                while (left < right && nums[left] == nums[left + 1]) left++;    // prevent duplicate triplet calc
                while (left < right && nums[right] == nums[right - 1]) right--; // prevent duplicate triplet calc

                left++;
                right--;
            }
            else if (sum < 0) left++;
            else right--;
        }


    }

    return result;
};