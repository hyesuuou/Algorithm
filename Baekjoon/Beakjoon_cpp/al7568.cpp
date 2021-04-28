#include <iostream>
using namespace std;

int main(){
    int n;
    cin >> n;

    int arr[n][2];
    int res[n]; // 결과

    int height, kg;

    for (int i=0; i<n; i++){
        cin >> kg;
        cin >> height;
        arr[i][0] = kg;
        arr[i][1] = height;
    }

    for (int i=0; i<n; i++){
        res[i] = 1; // 순위 모두 1 .. + 이후 하나씩 비교하면서 만약 둘다 작으면 1씩 추가할 예정..
    }

    // 배열을 돌면서
    for (int i=0; i<n; i++){    // 하나씩 비교해보기
        for (int j=0; j<n; j++){
            if (arr[i][0]<arr[j][0] && arr[i][1]<arr[j][1]){
                res[i] += 1;
            }
        }
    }

    for (int i=0; i<n; i++){
        cout << res[i] << " ";
    }
    cout << endl;

}