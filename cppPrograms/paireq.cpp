#include <bits/stdc++.h>
using namespace std;
int check(int a[], int n)
{
    int temp, m = INT_MIN;
    for (int i = 0; i < n; i++)
    {   temp=1;
        for (int j = i+1; j < n; j++)
        {
            if (a[i] == a[j])
                temp++;
        }
        m = max(m, temp);
    }
    return m;
}
int main()
{
    int t, i;
    cin >> t;
    while (t--)
    {
        int n, a[n], c;
        cin >> n;
        for (i = 0; i < n; i++)
        {
            cin >> a[i];
        }
        c = check(a, n);
        cout << n-c << endl;
    }
    return 0;
}