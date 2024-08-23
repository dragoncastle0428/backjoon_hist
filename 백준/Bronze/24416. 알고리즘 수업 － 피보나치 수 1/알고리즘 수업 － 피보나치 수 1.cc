#include <iostream>
using namespace std;

int n, cnt1 = 0, cnt2 = 0;

int fib(int N) {
    if (N == 1 || N == 2) {
        cnt1++;
        return 1;
    }
    else return (fib(N - 1) + fib(N - 2));
}

int main() {

    cin >> n;

    fib(n);

    cout << cnt1 << " " << n-2;
    return 0;
}