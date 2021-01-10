/**
 * 문제 - 백준 11726 (2xn 타일링)
 * Dynamic Programming
 * 점화식 D[n] = D[n-1] + D[n-2]
 * (끝에 2*1 타일 하나 들어가면, 2x(n-1) 타일링 문제가 됨) + (끝에 1*2타일 2개 들어가면 2*(n-2) 타일링 문제가 됨)
 * print문에서 %10007 했더니 틀렸음 (n이 커지면 int 형이 감당할 수 없는 숫자가 되기 때문일 것)
 * 그래서 d[k]에 저장하는 값 자체를 %10007 한 값으로 넣었더니 맞았다.
 * 18488KB 300ms
 */

import java.util.Scanner;

public class Main11726 {
    static int d[];
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        d = new int[n+1];
        int ans = tile(n);
        System.out.print(ans);
    }
    static int tile(int k){
        if (k==1) return 1;
        if (k==2) return 2;
        if (d[k]>0) return d[k];
        d[k] = (tile(k-1) + tile(k-2))%10007;
        return d[k];
    }
}
