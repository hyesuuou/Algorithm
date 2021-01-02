/**
 * 문제 - 백준 10430 (나머지)
 * 메모 - Scanner 이용
 * 메모리 18336KB 시간 224ms
 */


import java.util.Scanner;

public class Main10430 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println((a+b)%c);
        System.out.println(((a%c)+(b%c))%c);
        System.out.println((a*b)%c);
        System.out.println(((a%c)*(b%c))%c);

        scan.close();
    }
}
