#include <bits/stdc++.h>
using namespace std;
int main()
{
    int t, n, a, sum;
    cin >> t;
    while (t--)
    {
        sum = 0;
        cin >> n;
        while (n--)
        {
            cin >> a;
            sum += a;
        }
        if (sum % 2 == 0)
            cout << "YES"
                 << "\n";
        else
            cout << "NO"
                 << "\n";
    }
    return 0;
}