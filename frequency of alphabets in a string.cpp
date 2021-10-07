#include <iostream>
using namespace std;

int main() {
	string s;
	cin>>s;
	int count[26]={0}; // count array for all 26 alphabets set to 0 initially
	for(int i=0;i<s.size();++i){ //when we use math on alphabets its ascii val is taken into calculation , a is starting nd =97
	    int index=s[i]-'a';      // first alphabet's ascii is subtracted from a'ascii to get index 0 for a,index 1 for b n so on..
	     count[index]++;  //we update each alphabets index pos. with its frequency of occurence
	}
	for(int i=0;i<26;++i){  //since 26 alphabets only
	    if(count[i]==0){   //only shows count of alphabets present in string
	cout<<char(i+'a')<<endl; //char converts ascii to alphabet ..so starts from 0+97
	}
	}
	return 0;
}
