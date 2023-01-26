#include <bits/stdc++.h>
using namespace std;
int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        string str;
        int counter;
        cin >> str;
        for (int i = 0; i < str.length(); i++)
        {
            counter = 0;
            if (str[i] == 'a' || str[i] == 'e' || str[i] == 'i' || str[i] == 'o' || str[i] == 'u')
            {
                for (int j = i; j < str.length(); j++)
                {
                    if (str[j] == 'a' || str[j] == 'e' || str[j] == 'i' || str[j] == 'o' || str[j] == 'u')
                    {
                        counter++;
                    }
                    else
                        break;
                }
            }
            if (counter > 2)
            {
                cout << "Happy" << endl;
                break;
            }
        }
        if (counter <= 2)
            cout << "Sad" << endl;
    }
    return 0;
}