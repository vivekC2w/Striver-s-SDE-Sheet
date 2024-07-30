int partition(vector<int> arr, int low, int high) {
    int pivot = arr[low];
    int i = low;
    int j = high;

    while(i < j) {
        //find the 1st element greater than pivot
        while(arr[i] <= pivot && i < high) {
            i++;
        }
        //find the 1st element smaller than pivot
        while(arr[j] > pivot && j > low) {
            j--;
        }
        //if i and j haven't cross 
        if(i < j) swap(arr[i], arr[j]);
    }
    //place pivot to its correct position
    swap(arr[low], arr[j]);
    return j;
}

void swap(int &a, int &b) {
    int temp = a;
    a = b;
    b = temp;
}

void quickSort(vector<int> arr, int low, int high) {
    if(low < high) {
        int partitionIndex = partition(arr, low, high);
        quickSort(arr, low, partitionIndex - 1);
        quickSort(arr, partitionIndex + 1, high);
    }
}

int main() {
    vector<int> arr = {9, 4, 7, 6, 3, 1, 5};
    int n = 7;

    cout << "Before starting array: ";
    for (int i = 0; i < n; i++) {
        cout << arr[i] << " ";
    }
    cout << endl;
    quickSort(arr, 0, n - 1);
    cout << "After sorting array: ";
    for (int i = 0; i < n; i++) {
        cout << arr[i] << " ";
    }
    cout << endl;
    return 0;
}

//Time complexity -> O(nlogn)
//Space Complexity -> O(1)
