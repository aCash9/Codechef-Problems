#include <bits/stdc++.h>
using namespace std;
int main()
{
    int t,s,x,y,z;
    cin >> t;
    while (t--)
    {
        cin>>s>>x>>y>>z;
        int d;
        d = s - (x + y);
        if (d == z || d > z)
        {
            cout
                << 0 << endl;
        }
        else if (d < z || d == 0)
        { 
            if ((s - x) >= z || (s - y) >= z)
                cout << 1 << endl;
            else
                cout << 2 << endl;
        }
    }
    return 0;
}