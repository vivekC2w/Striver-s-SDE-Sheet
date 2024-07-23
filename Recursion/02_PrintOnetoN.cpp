printOneToN(i, n) {
    if(i == n) {
        cout << i << " ";
        return;
    }

    printOneToN(i+1, n);
}

main() {
    int n;
    cin >> n;
    printOneToN(1, n);
    return 0;
}