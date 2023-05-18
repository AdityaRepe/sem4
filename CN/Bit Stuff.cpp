// bitstuffing

#include <iostream>
using namespace std;

int main()
{
    string data,finalData;
    cout << "Enter the data: ";
    cin >> data;
    int count = 0;
    string flag = "01111110";
    finalData += flag;
    for (int i = 0; i != data.length(); i++)
    {
        if (data[i] == '1' && count == 5)
        {
            count = 0;
            finalData += '0';
        }
        if (data[i] == '1')
        {
            count++;
        }
        else if (count > 0)
        {
            count = 0;
        }
        finalData += data[i];
    }
    finalData += flag;
    cout << "\nFinal data: " << finalData << "\n\n";
    return 0;
}
