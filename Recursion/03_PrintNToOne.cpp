printNameNTimes(int i, int n) {
    if(i == 0) {
        cout << i << " ";
        return;
    }

    printNameNTimes(i-1, n);
}

main() {
    int n;
    cin >> n;
    printNameNTimes(n, n);
    return 0;
}