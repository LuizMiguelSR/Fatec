#include <iostream>
#include <locale.h>
using namespace std;

int main(int argc, char** argv){
    setlocale(LC_ALL,"");

    int a, b, soma;
    int *pont1, *pont2;
    
    cout<<"Digite os valores de a e b: ";
    cin>>a>>b;
    pont1=&a;
    pont2=&b;
    cout<<"Enderešo de memoria de a = "<<&a;
    cout<<"\nEnderešo de memoria de b = "<<&b;
    cout<<"\nEnderešo de memoria de pont1 = "<<pont1;
    cout<<"\nEnderešo de memoria de pont2 = "<<pont2;
 
    pont1=&soma;
    soma = a + b;
    
    cout<<"\nEnderešo de memoria de pont1 = "<<*pont1;

    return 0;
}