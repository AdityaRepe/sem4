#include <stdio.h>

int main()
{

    int fSize, n;

    printf("Enter the frame size : ");
    scanf("%d", &fSize);

    printf("\nEnter the number of entries : ");
    scanf("%d", &n);

    int pageStream[n];
    printf("\nEnter the data of stream : ");
    for (int i = 0; i < n; i++)
    {
        scanf("%d", &pageStream[i]);
    }

    int frame[fSize], counter = 0, pageFaults = 0, i = 0;
    for (int j = 0; j < fSize; j++)
    {
        frame[j] = -1;
    }

    printf("Incoming Stream\t\tFrames\n");
    while (i < n)
    {

        int found = 0;

        for (int j = 0; j < fSize; j++)
        {
            if (frame[j] == pageStream[i])
            {
                found = 1;
                break;
            }
        }
        if (found == 0)
        {
            frame[(counter) % (fSize)] = pageStream[i];
            pageFaults++;
            counter++;
        }

        printf("%d\t\t\t", pageStream[i]);
        for (int j = 0; j < fSize; j++)
        {
            if (frame[j] == -1)
            {
                printf("  ");
            }
            else
            {
                printf("%d ", frame[j]);
            }
        }
        printf("\n");
        i++;
    }

    printf("\nNumber of faults : %d", pageFaults);
    printf("\nNumber of hits : %d", n - pageFaults);
}

