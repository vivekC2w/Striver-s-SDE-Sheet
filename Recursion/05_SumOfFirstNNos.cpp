void printSumOfFirstNNos(int i, int sum) {
    if(n < 1) {
        cout << sum;
        return;
    }

    printSumOfFirstNNos(i - 1, sum + i);
}

// second method
void printSumOfFirstNNums(int n) {
    if(n == 0) return 0;

    return n + printSumOfFirstNNums(n - 1);

}

int main() {
    int n;
    cin >> n;
    printSumOfFirstNNos(n, 0);
    int sum = printSumOfFirstNNums(n);
    cout << sum;
    return 0;
}



