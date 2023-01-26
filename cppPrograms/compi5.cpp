#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;
    cin>>t;
    char ch;
    while (t--)
    {
        cin>>ch;
        ch=tolower(ch);
        switch (ch)
        {
        case 'b':
            cout<<"BattleShip";
            break;
        case 'c':
            cout<<"Cruiser";
            break;
        case 'd':
            cout<<"Destroyer";
            break;
        case 'f':
            cout<<"Frigate";
            break;
        }
        cout<<endl;
    }
return 0;
}