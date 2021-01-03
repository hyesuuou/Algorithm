/**
 * 문제 - 백준 1929 (소수 구하기)
 * Main1929 보다 시간 축소해서 다시 푼 코드 -> 입출력에 buffer 사용하고, 배열 사용하지 않음
 * 20952KB 592ms
 */

import java.io.*;
import java.util.StringTokenizer;

public class Main1929_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String tmp = bf.readLine();
        StringTokenizer st = new StringTokenizer(tmp);
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        w1 :
        for (int i=a; i<=b; i++){
            if (i<2) continue;
            else{
                if (primetrue(i) == true) bw.write(i+"\n");
            }

        }
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
