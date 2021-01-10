/**
 * 문제 - 백준 1463 (1로만들기)
 * Dynamic Programming top-down 방식으로 구현함
 * 값을 memorization 해 놓을 d 배열 (인덱스와 숫자가 맞게 하기 위해 크기는 n+1로)
 *
 */

import java.util.Scanner;

public class Main1463 {
    public static int d[];
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        d = new int[n+1];   //모두 0으로 초기화
        int ans = calcu(n);
        System.out.print(ans);


    }
    static int calcu(int k){

        if (k==1){
            return 0;
        }
        if (d[k]>0){    // 메모해놓은 값이 있으면
            return d[k];
        }

        d[k] = 1 + calcu(k-1);
        // 2로 나누어 떨어지는 경우
        if((k%2 == 0)){
            int temp = 1 + calcu(k/2);
            if (temp < d[k]){   // 최솟값을 구해야 하므로 2로 나눠떨어져 만들어진 결과가 더 작으면 그 값을 대신 저장
                d[k] = temp;
            }
        }
        // 3으로 나누어 떨어지는 경우
        if (k%3 ==0){
            int temp = 1 + calcu(k/3);
            if (temp < d[k]) {
                d[k] = temp;
            }
        }
        return d[k];

    }
}

