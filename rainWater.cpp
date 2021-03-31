#include <iostream>
#include <math.h>
using namespace std;

// void waterVol(int arr[], int n)                   // O(n^2)
// {
//     int res = 0;
//     for (int i = 1; i < n - 1; i++)
//     {

//         int left = arr[i];
//         for (int j = 0; j < i; j++)
//         {
//             left = max(left, arr[j]);
//         }

//         int right = arr[i];
//         for (int k = i + 1; k < n; k++)
//         {
//             right = max(left, arr[k]);
//         }

//         res += min(left, right) - arr[i];
//     }
//     cout << res;
// }

void waterVol(int arr[], int n)           //O(n)
{
    int res = 0, left[n], right[n];

    left[0] = arr[0];
    for (int i = 1; i < n; i++)
    {
        left[i] = max(left[i - 1], arr[i]);
    }

    right[n - 1] = arr[n - 1];
    for (int i = n - 2; i >= 0; i--)
    {
        right[i] = max(right[i + 1], arr[i]);
    }

    for (int i = 0; i < n; i++)
    {
        res += min(left[i], right[i]) - arr[i];
    }

    cout << res;
}

int main()
{
    int n;
    cin >> n;
    int arr[n];
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }
    waterVol(arr, n);
}