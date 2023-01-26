#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t ,r;
    cin>>t;
    while(t--)
    {
        int n,c=0 ;
        cin>>n;
        while(n!=0)
        {
            r=n%10;
            if(r==4)
                c++;
            n/=10;
        }
    cout<<c<<"\n";
    }
return 0;
}