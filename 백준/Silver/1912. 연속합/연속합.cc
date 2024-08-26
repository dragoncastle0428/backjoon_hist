#include <iostream>

using namespace std;

int arr[100000];
int n;

int main() {
    cin >> n;

    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
        if (i > 0) {
            if (arr[i] < arr[i] + arr[i - 1]) {
                arr[i] = arr[i] + arr[i - 1];
            }
        }
    }

    int max = -9999999999;

    for (int i = 0; i < n; i++) {
        if (arr[i] > max) {
            max = arr[i];
        }
    }

    cout << max;
}