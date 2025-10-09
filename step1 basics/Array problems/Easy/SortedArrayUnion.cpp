#include <iostream>
#include <vector>
using namespace std;
class SortedArrayUnion{
    public:
        vector<int> sortedUnion(vector<int>& arr1,vector<int>& arr2,int n,int m){
            vector<int> finalArray=vector<int>();
            int i=0;
            int j=0;

            while(i<n && j<m){
                if(arr1[i]>arr2[j]){
                    if(finalArray.empty() || finalArray.back()!=arr2[j]){
                        finalArray.push_back(arr2[j]);
                    }
                    j++;
                }
                else if(arr2[j]>arr1[i]){
                    if(finalArray.empty() || finalArray.back()!=arr1[i]){
                        finalArray.push_back(arr1[i]);
                    }
                    i++;
                }
                else{
                    if (finalArray.empty() || finalArray.back() != arr1[i])
                        finalArray.push_back(arr1[i]);
                    j++;
                    i++;
                }
            }

            while(j<m){
                if(finalArray.empty() || finalArray.back()!=arr2[j]){
                    finalArray.push_back(arr2[j]);
                }
                j++;
            }

            while(i<n){
                if(finalArray.empty() || finalArray.back()!=arr1[i]){
                    finalArray.push_back(arr1[i]);

                }
                i++;
            }
            return finalArray;
        }

};

int main(){
        vector<int> arr1 = {1,2,3,4,5} ; 
        vector<int> arr2 = {2,3,4,4,5};

        int n=arr1.size();
        int m=arr2.size();
        SortedArrayUnion su=SortedArrayUnion();
        vector<int> finalArr=su.sortedUnion(arr1,arr2,n,m);

        for(int i=0;i<finalArr.size();i++){
            cout<<finalArr[i];
        }
        return 0;

    }