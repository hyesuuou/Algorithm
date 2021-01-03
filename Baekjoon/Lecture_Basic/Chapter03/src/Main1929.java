/**
 * 문제 - 백준 1929 (소수구하기)
 * 시간단축이 필요해 보인다.
 * 36160KB 1296ms
 */
import java.util.Scanner;

public class Main1929 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        boolean prime [] = new boolean [b-a+1];
        for (int i=a; i<=b; i++){
            if (primetrue(i)==true){
                prime[i-a]=true;
            }
        }

        // 배열이 true 인것의 인덱스 + a만 출력
        for (int i=0; i< prime.length; i++){
            if (prime[i]==true){
                System.out.println(i+a);
            }
        }
    }
    static boolean primetrue(int n){
        if (n<2) return false;
        for (int i=2; i*i <=n; i++){
            if (n%i == 0) return false;
        }
        return true;
    }

}
