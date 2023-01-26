#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t ,a ,i=0,r,s=0;
    cin>>t;
    while (i!=t)
    {
        cin >> a; 
        while (a!=0)
        {
            r=a%10;
            s+=r;
            a=a/10;
        }
        cout<<s<<endl;
        s=0;
        i++;
    }
return 0;
}