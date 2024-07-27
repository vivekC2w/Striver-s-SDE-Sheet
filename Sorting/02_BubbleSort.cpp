#include <bits/stdc++.h>
using namespace std;

void bubble_sort(int arr[], int n) {
    for(int i = n-1; i >= 0; i--) {
        int didSwap = 0;
        for(int j = 0; j <= i-1; j++) {
            if(arr[j] > arr[j+1]) swap(arr[j], arr[j+1], didSwap);
        }
        if(didSwap == 0) break; // if array is already sorted
    }
}

void swap(int &a, int &b, int &didSwap) {
    int temp = a;
    a = b;
    b = temp;
    didSwap = 1;
}

int main() {
    int n;
    cin >> n;
    int arr[n];
    for(int i = 0; i < n; i++) {
        cin >> arr[i];
    }
    bubble_sort(arr, n);
    return 0;
}