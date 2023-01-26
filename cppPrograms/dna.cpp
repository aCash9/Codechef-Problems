#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t,n;
    string s;
    cin>>t;
    while(t--)
    {
        cin>>n;
        cin>>s;
        for(int i=0;i<s.length();i++)
        {
            char ch = s[i];
            switch (ch)
            {
            case 'A':
                cout<<"T";
                break;
            case 'T':
                cout<<"A";
                break;
            case 'C':
                cout<<"G";
                break;
            case 'G':
                cout<<"C";
                break;
            }
        }  
        cout<<endl;
    }
return 0;
}