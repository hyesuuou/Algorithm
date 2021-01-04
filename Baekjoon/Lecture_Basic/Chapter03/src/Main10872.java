/**
 * 문제 - 백준 10872 (팩토리얼)
 * while 문 이용해서 구현한 코드
 */

import java.io.*;

public class Main10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        int result = 1;
        for (int i=n; i>0; i--){
            result *= i;
        }
        bw.write(result+"");
        bw.flush();
        bw.close();
    }
}
