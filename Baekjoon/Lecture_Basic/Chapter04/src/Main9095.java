/**
 * 문제 - 백준 9095 (1,2,3더하기)
 * Dynamic Programming top-down 방식으로 풀었다.
 * 점화식 : D[n] = D[n-1] + D[n-2] + D[n-3]
 * D[n] : n을 1,2,3의 합으로 나타내는 방법의 수
 * 1. 마지막에 1을 더하는 경우 -> D[n] = 1 + D[n-1] -> D[n-1] 구하기
 * 2. 마지막에 2를 더하는 경우 -> D[n] = 2 + D[n-2]
 * 3. 마지막에 3을 더하는 경우 -> D[n] = 3 + D[n-3]
 */

import java.util.Scanner;

public class Main9095 {
    static int d[];
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- >0){
            int n = scan.nextInt();
            d = new int[n+1];
            int ans = plus(n);
            System.out.println(ans);
        }
        scan.close();
    }
    static int plus(int k){
        if (k==1) return 1;
        else if (k==2) return 2;
        else if (k==3) return 4;
        if (d[k]>0) return d[k];
        d[k] = plus(k-1) + plus(k-2) + plus(k-3);
        return d[k];
    }

}
