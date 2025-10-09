#include <iostream>
using namespace std;

void func(int i, int n){
    if(i>n){
        return;
    }

    cout << "javan"<<endl;

    func(i+1,n);
}

int main(){
    func(1,5);
}