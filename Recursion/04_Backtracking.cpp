//print 1 to N

void printOneToN(int i, int n) {
    if(i == 0) {
        return;
    };

    printOneToN(i-1, n);
    cout << i << " ";
}

main() {
    int n;
    cin >> n;
    printOneToN(n, n);
    return 0;
}