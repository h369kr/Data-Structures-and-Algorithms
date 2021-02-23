#include<iostream>
#include<math.h>
using namespace std;

// long count(long n){
//     long count =0;
//     while(n!=0){
//         n=n/10;
//         ++count ;
//     }
//     return count;
// }

// int main(){
//     long n;
//     cin >> n;
//     long z = count(n);
//     cout << z;
//     return 0;
// }

// long long count(long long n){
//     if(n == 0){
//         return 0;
//     }
//     return 1+count(n/10);
// }

// int main(){
//     long long n;
//     cin >> n;
//     long long z = count(n);
//     cout << z;
//     return 0;
// }

long long count(long long n){
    return 1+ floor(log10(n));
}

int main(){
    long long n;
    cin >> n;
    long long z = count(n);
    cout << z;
    return 0;
}