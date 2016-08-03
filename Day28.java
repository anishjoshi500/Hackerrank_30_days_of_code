#include <map>
#include <set>
#include <list>
#include <cmath>
#include <ctime>
#include <deque>
#include <queue>
#include <stack>
#include <string>
#include <bitset>
#include <cstdio>
#include <limits>
#include <vector>
#include <climits>
#include <cstring>
#include <cstdlib>
#include <fstream>
#include <numeric>
#include <sstream>
#include <iostream>
#include <algorithm>
#include <unordered_map>

using namespace std;


int main(){
    list<string> name;
    int n;
    cin >> n;
    string firstN;
    string email;
    for(int i = 0; i < n; i++)
    {
        cin >> firstN >> email;
        if ( email.find("@gmail.com") != std::string::npos) 
        {
            name.push_front(firstN);
        }
    }
    name.sort();
    for (auto & nam:name) {
        cout << nam << endl;
    }
    return 0;
}
