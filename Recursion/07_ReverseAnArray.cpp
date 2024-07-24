void reverseArray(int arr[], int start, int end) {
    if(start >= end) {
        return;
    }

    swap(arr[start], arr[end]);
    reverseArray(arr, start + 1, end - 1);
}

void reverseArrayUsingSinglePtr(int arr[], int start) {
    int n = arr.length;

    if(start >= n/2) {
        return;
    }
    swap(arr, start, n - start - 1);
    reverseArrayUsingSinglePtr(arr, start + 1);
}

int main() {
    cin >> n;
    int arr[n];
    for(int i = 0; i < n; i++) {
        cin >> arr[i];
    }

    reverseArray(arr, 0, n - 1);
    reverseArrayUsingSinglePtr(arr, 0);
    return 0;
}