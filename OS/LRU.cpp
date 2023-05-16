#include <bits/stdc++.h>
using namespace std;

void displayFrames(const unordered_set<int>& frames)
{
    for (auto it = frames.begin(); it != frames.end(); it++)
    {
        cout << *it << " ";
    }
    cout << endl;
}

int pageFaults(int pages[], int n, int capacity) {
    unordered_set<int> frames;
    unordered_map<int, int> indexes;
    int page_faults = 0;
    for (int i = 0; i < n; i++)
    {
        if (frames.size() < capacity)
        {
            if (frames.find(pages[i]) == frames.end())
            {
                frames.insert(pages[i]);
                page_faults++;
            }
            indexes[pages[i]] = i;
        }
        else
        {
            if (frames.find(pages[i]) == frames.end())
            {
                int lru = INT_MAX, val;
                for (auto it = frames.begin(); it != frames.end(); it++)
                {
                    if (indexes[*it] < lru)
                    {
                        lru = indexes[*it];
                        val = *it;
                    }
                }
                frames.erase(val);
                frames.insert(pages[i]);
                page_faults++;
            }
            indexes[pages[i]] = i;
        }

        cout << "Frames: ";
        displayFrames(frames);
    }

    return page_faults;
}

int main() {
    int pages[] = {7, 0, 1, 2, 0, 3, 0, 4, 2, 3, 0, 3, 2,1,2,0,1,7,0,1 };
    int n = sizeof(pages) / sizeof(pages[0]);
    int capacity = 4;

    cout << "Page Faults: " << pageFaults(pages, n, capacity) << endl;

    return 0;
}
