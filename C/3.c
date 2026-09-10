#include <stdio.h>

int inc(int counter);

int main(void) {
    int i;
    i = 10;
    
    printf("호출 전 i = %d\n", i);
    i = inc(i);
    printf("호출 후 i = %d\n", i);
    return 0;
}

int inc(int counter) {
    return ++counter;
}