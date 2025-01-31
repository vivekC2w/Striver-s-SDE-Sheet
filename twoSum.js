/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    const hashTable = {};
    for(let i = 0; i < nums.length; i++) {
        const complement = target - nums[i];
        if(complement in hashTable) {
            return [hashTable[complement], i];
        }
        hashTable[nums[i]] = i;
    }
    return [];
};
