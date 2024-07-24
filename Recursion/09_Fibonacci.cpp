int fibonacci(int n) {
    if(n <= 1 && n >= 0) {
        return n;
    }

    return fibonacci(n - 1) + fibonacci(n - 2);
}

int main() {
    cin >> n;
    cout << fibonacci(n);
    return 0;
}

//time complexity O(2^n) -> exponesial time
//space complexity O(n)