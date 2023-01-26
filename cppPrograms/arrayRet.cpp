#include <bits/stdc++.h>
using namespace std;
void OG()
{
     long long n, x, sa = 0, sb = 0;
        cin >> n;
        vector<long long> a(n);
        for (int i = 0; i < n; i++)
        {
            cin >> a[i];
            sb += a[i];
        }
        sa = sb / (n + 1);
        for (int i = 0; i < n; i++)
        {
            a[i]-=sa;
        }
        for(auto &it : a)
            cout<<it<<" ";
        cout << "\n";
}
int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        OG();
    }
    return 0;
}