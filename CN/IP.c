#include <stdio.h>

int main() {
    char ip_class;
    char *subnet_class = "0";
    unsigned int x;
    printf("Enter the ip address :- ");
    scanf("%u",&x);

    if(x<128){
        ip_class = 'A';
        subnet_class = "255.0.0.0";
    }
    else if(x<192){
        ip_class = 'B';
        subnet_class = "255.255.0.0";
    }
    else if(x<224){
        ip_class = 'C';
        subnet_class = "255.255.255.0";
    }
    else if(x<240){
        ip_class = 'D';
        subnet_class = "Multicast Class";
    }
    else {
        ip_class = 'E';
        subnet_class = "Reserved Class";
    }
    printf("Class :- %c \n",ip_class);
    printf("Subnet :- %s \n",subnet_class);

    return 0;
}
