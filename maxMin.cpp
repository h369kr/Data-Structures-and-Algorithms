#include <iostream>
using namespace std;

void maxMin(int arr[], int n)
{
    int max = 0;
    int min = 987654321;
    for (int i = 0; i < n; i++)
    {
        while (arr[i] > max)
        {
            max = arr[i];
        }
        while (arr[i] < min)
        {
            min = arr[i];
        }
    }
    cout << "Max ele of arr : " << endl;
    cout << max << endl;
    cout << "Min ele of arr : " << endl;
    cout << min << endl;
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
    maxMin(arr, n);
    return 0;
}