#include <bits/stdc++.h>
using namespace std;
int main()
{
    int n, k, c = 0;
    cin >> n >> k;
    int i = 0, a;
    while (i < n)
    {
        cin >> a;
        if (a % k == 0)
            c++;
        i++;
    }
    cout << c;
    return 0;
}