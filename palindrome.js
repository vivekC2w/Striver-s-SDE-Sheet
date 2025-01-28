// function removeNonAlphanumeric(inputString) {
//     return inputString.replace(/[^a-zA-Z0-9]/g, '').toLowerCase();
// }

function removeNonAlphanumericChars(inputString) {
    let result = '';
    
    for (let i = 0; i < inputString.length; i++) {
        const char = inputString[i];
        if (
            (char >= 'a' && char <= 'z') ||
            (char >= 'A' && char <= 'Z') ||
            (char >= '0' && char <= '0') 
        ) {
            result += char;
        }
    }
    
    return result;
}

function isPalindromeValid(str) {
    let cleanedString = removeNonAlphanumericChars(str);
    const finalString = cleanedString.toLowerCase();
    console.log(finalString);
    let left = 0;
    let right = finalString.length - 1;

    while(left < right) {
        if (finalString[left] !== finalString[right]) return false;
        left++;
        right--;
    }
    return true;
} 

console.log(isPalindromeValid('A man, a plan, a canal, Panama!')); 
console.log(isPalindromeValid('racecar')); 
console.log(isPalindromeValid('hello')); 
console.log(isPalindromeValid(''));
console.log(isPalindromeValid('12.02.2021'));
