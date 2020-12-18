#include <iostream>
using namespace std;

int BinarySearch(int arr[], int key, int low, int high)
{
    if (low > high)
    {
        return -1;
    }
    int mid = low + ((high - low) / 2);
    if (arr[mid] == key)
    {
        return mid;
    }
    else if (key > arr[mid])
    {
        return BinarySearch(arr, key, mid + 1, high); //using Recursion
    }
    else
    {
        return BinarySearch(arr, key, low, mid - 1);
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
    cout << "Enter Key : ";
    int key;
    cin >> key;
    cout << "Key Index Is :" << BinarySearch(arr, key, 0, n - 1);

    return 0;
}