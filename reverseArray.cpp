#include <iostream>
using namespace std;

void reverseArray(int arr[], int start, int end)
{
    while (start < end)
    {
        int temp = arr[start];
        arr[start++] = arr[end];
        arr[end--] = temp;
    }
}

void printArr(int arr[], int n)
{
    for (int i = 0; i < n; i++)
    {
        cout << arr[i] << " ";
    }
}

int main()
{

    cout << "Enter Length Of Array : ";
    int n;
    cin >> n;
    int arr[n];
    cout << "Enter Array Elements :";
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }
    reverseArray(arr,0, n - 1);
    cout << "Reversed Array : " << endl;
    printArr(arr, n);
    return 0;
}