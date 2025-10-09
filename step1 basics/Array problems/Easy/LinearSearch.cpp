#include <iostream>
#include <vector>
using namespace std;
class LinearSearch{
    public:
        int linearSearch(vector<int>& nums,int k){
            for(int i=0;i<nums.size();i++){
                if(nums[i]==k){
                    return i;
                }
            }
            return -1;
        }

    
};

int main(){
        vector<int> nums={0,1,0,3,12};

        LinearSearch ls=LinearSearch();
        int index=ls.linearSearch(nums,0);

        if(index==-1){
            cout<<"not found";
        }else{
            cout<<index<<endl;
        }
        return 0;

    }