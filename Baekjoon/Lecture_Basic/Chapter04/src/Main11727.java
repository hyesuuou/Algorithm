/**
 * 문제 - 백준 11727 (2xn 타일링2)
 * Dynamic Programming top-down 으로 구현
 * 배열 d에 계산된 값을 memorization함
 * * 점화식 D[n] = D[n-1] + 2*D[n-2]
 * 1. 마지막에 2x1 타일 놓는 경우 = D[n-1]
 * 2. 마지막에 2x2 타일 놓는 경우 = D[n-2]
 * 3. 마지막에 1x2 타일 놓는 경우 = D[n-2]
 */

import java.util.Scanner;

public class Main11727 {
    static int [] d;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        d = new int[n+1];
        int ans = tile2(n);
        System.out.print(ans);
        scan.close();
    }
    static int tile2(int k){
        if (k==1) return 1;
        if (k==2) return 3;
        if (d[k]>0) return d[k];
        d[k] = (tile2(k-1) + 2*tile2(k-2))%10007;
        return d[k];
    }
}
