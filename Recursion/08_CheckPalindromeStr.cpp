bool checkPalindrome(String str, int start, int end) {
    if(str[start] != str[end]) {
        return false;
    }

    if(start >= end) {
        return true;
    }
    return checkPalindrome(str, start + 1, end - 1);
}

bool checkPalindromeUsingSinglePtr(String str, int start) {
    int n = str.length;

    if(str[start] != str[n - start - 1]) {
        return false;
    }

    if(start >= n/2) {
        return true;
    }
    return checkPalindromeUsingSinglePtr(str, start + 1);
}

int main() {
    String str;
    cin >> str;
    cout << checkPalindrome(str, 0, str.length - 1);
    cout << checkPalindromeUsingSinglePtr(str, 0);
    return 0;
}