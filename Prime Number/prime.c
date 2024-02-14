#include <stdio.h>
#include <math.h>

int main() {
    int x, i, f;
    printf("Enter a number: ");
    scanf("%d", &x);
    f=0;
    float sq = sqrt(x);
    for (i = 2; i <= sq; i++) {
        if (x % i == 0) {
            f=1;
            break;
        }
    }
    if(f>=1){
        printf("\n0.00\n");
    }else{
            printf("\n%.2f\n", sq);
    }

    return 0;
}
