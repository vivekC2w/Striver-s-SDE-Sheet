void printNameNTimes(int n) {
    //base condition
    if(n == 0)
        return;

    //recursive call
    printNameNTimes(n-1);
    //operation
    cout << "Vivek" << " ";
}

main() {
    int n;
    cin >> n;
    printNameNTimes(n);
    return 0;
}

time complexity = O(n)
space complexity = O(n)