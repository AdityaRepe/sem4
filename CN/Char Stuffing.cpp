// charstuffc++

#include <iostream>
#include <string.h>
using namespace std;

int main()
{
    string data, finalData;
    cout << "Enter the data: ";
    cin >> data;
    string stx = "STX", dle = "DLE";
    int count = 0;
    finalData += stx + dle;
    for (int i = 0; i != data.length(); i++)
    {
        finalData += data[i];
        if (data[i] == 'D')
        {
            count = 1;
        }
        else if (count == 1 && data[i] == 'L')
        {
            count++;
        }
        else if (count == 2 && data[i] == 'E')
        {
            finalData += "DLE";
            count = 0;
        }
        else
        {
                count = 0;
        }
    }
    finalData += dle + stx;
    cout << "\nFinal data: " << finalData << "\n\n";
}
