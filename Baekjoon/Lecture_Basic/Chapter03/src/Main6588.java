/**
 * 문제 - 백준 6588 (골드바흐의 추측)
 * 메모
 * - N = A+B 라 할때 A는 홀수이므로  2a+3 으로 간주 (a,b는 0부터)
 * 먼저 a를 하나씩 늘리면서 반복하고, 그 수가 소수인지 판단 ->  소수면 b도 판단 -> b도 소수면 bw에 write
 * - a<b 라는 조건을 빼먹었었다.
 * 버퍼 사용하면 - 37092KB 620ms
 * 스캐너사용하면 - 73040KB 1020ms
 * Stringbuilder 사용하면 - 33524KB 620ms
 */

import java.io.*;

public class Main6588 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int a, b=0;
        while (true){
            a = -1;
            int n = Integer.parseInt(bf.readLine());
            if (n==0) break;

            for (int i=0; i<n/2; i++){
                if (primetrue(2*i+3)==true){
                    b = n - (2*i+3);
                    if (primetrue(b) && (2*i+3)<=b){
                        a = 2*i+3;
                        b = n-a;
                        //bw.write(n + " = "); bw.write(a + " + "); bw.write(b+"\n");
                        sb.append(n + " = " + a + " + " + b + "\n");

                        break;
                    }
                }
            }

            if (a==-1) bw.write("Goldbach's conjecture is wrong.\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
    static boolean primetrue(int n){
        if (n<2) return false;
        for (int i=2; i*i <=n; i++){
            if (n%i == 0) return false;
        }
        return true;
    }
}
