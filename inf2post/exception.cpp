#include<iostream>
using namespace std;
int main()
{

        int a,b;
        cout<<"enter the value of a and b\n";
        cin>>a>>b;
        int x=(a-b);
        try
        {

                if(x!=0)
                        cout<<"result x="<<a/x;
                else
                {

                        throw(x);
                }

        }
        catch(int i)
        {


            cout<<"exception caugth:x="<<x<<endl;
        }
        cout<<"end";
        return 0;

}
