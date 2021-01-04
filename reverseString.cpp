#include <iostream>
using namespace std;

void reverseString(string &str, int start, int end)
{

    while (start < end)
    {
        char temp = str[start];
        str[start++] = str[end];
        str[end--] = temp;
    }
}

void printString(string &str, int len)
{

    for (int i = 0; i < len; i++)
    {
        cout << str[i];
    }
}

int main()
{

    string str;
    cout << "Enter String : ";
    getline(cin, str);
    int len = str.length();
    //cout << len;
    reverseString(str, 0, len - 1);
    cout << "Reversed string : ";
    printString(str, len);
    return 0;
}