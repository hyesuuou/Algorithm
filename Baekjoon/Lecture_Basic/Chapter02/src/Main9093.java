/**
 * 문제 - 백준 9093 (단어뒤집기) - 스택사용
 */

import java.io.*;
import java.util.StringTokenizer;

public class Main9093 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(bf.readLine());
        char stack[] = new char[20];
        while (t-- > 0) {
            String tmp = bf.readLine();
            StringTokenizer st = new StringTokenizer(tmp);

            // We / Want / to /win/the/first/prize
            while (st.hasMoreTokens()) {
                int top = -1;
                String now = st.nextToken();
                // w/e, w/a/n/t ... 스택에 넣기
                for (int i = 0; i < now.length(); i++) {
                    stack[++top] = now.charAt(i);
                }
                // 하나씩 빼면서 출력하기
                for (int i = 0; i < now.length(); i++) {
                    bw.write(stack[top--]);
                }
                bw.write(" ");


            }
            bw.write("\n");

        }
        bw.flush();
        bw.close();

    }
}
