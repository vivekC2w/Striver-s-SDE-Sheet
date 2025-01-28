function largestContainer(heights) {
    let maxWater = 0;
    let left = 0;
    let right = heights.length - 1;
    
    while (left < right) {
        const water = Math.min(heights[left], heights[right]) * (right - left);
        maxWater = Math.max(maxWater, water);
        
        if(heights[left] < heights[right]) {
            left++;
        } else if(heights[left] > heights[right]) {
            right--;
        } else {
            left++;
            right--;
        }
    }
    return maxWater;
}

console.log(largestContainer([1, 2, 3]));
