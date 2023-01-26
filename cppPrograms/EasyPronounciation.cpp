#include <bits/stdc++.h>
using namespace std;
int main()
{
    int t;
    cin >> t;
    string str;
    int counter=0, length;
    while (t--)
    {
        cin >> length;
        cin >> str;
        if (length < 4)
        {
            cout << "YES" << endl;
            continue;
        }
        for (int i = 0; i < length; i++)
        {
            counter = 0;
            if (str[i] != 'a' || str[i] != 'e' || str[i] != 'i' || str[i] != 'o' || str[i] != 'u')
            {
                for (int j = i; j < length; j++)
                {
                    if (str[j] != 'a' || str[j] != 'e' || str[j] != 'i' || str[j] != 'o' || str[j] != 'u')
                    {
                        counter++;
                    }
                    else
                        break;
                }
            }
            if (counter >= 4)
            {
                cout << "NO" << endl;
                break;
            }
        }
        if (counter < 4)
            cout << "YES" << endl;
    }
    return 0;
}