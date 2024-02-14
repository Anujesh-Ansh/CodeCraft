#include<iostream>
#include<math.h>

using namespace std;

int main(){

    int x, i,f;
    f=0;
    cout << "Enter the value of x: ";
    cin >>  x;
    float sq= sqrt(x);
    
    for(i=2;i<=sq;i++){
        if(x%i == 0){
            f=1;
            break;
        }
    }
    if(f>=1){
        cout << "\n0.00";
    }
    else{

        printf("\n%.2f\n", sq);
        // cout << sq <<"\n";
    }


    return 0;
}