#include <bits/stdc++.h>
using namespace std;
int main()
{
    int t;
    int n, k;
    cin >> t;
    while (t--)
    {
        cin >> n >> k;
        int a;
        for (int i = 0; i < n; i++)
        {
            cin >> a;
            if (a <= k)
            {
                cout << 1;
                k -= a;
            }
            else
                cout << 0;
        }
        cout<<"\n";
    }
    return 0;
}