/**
 * 문제 - 백준 10430 (나머지)
 * 메모 - BufferedReader, BufferedWriter 이용 -> 시간 단축 !
 * 메모리 16296KB 시간 160ms
 */


import java.io.*;
import java.util.StringTokenizer;

public class Main10430_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String tmp = bf.readLine();
        StringTokenizer st = new StringTokenizer(tmp);
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        bw.write((a+b)%c+"\n");
        bw.write(((a%c)+(b%c))%c+"\n");
        bw.write((a*b)%c+"\n");
        bw.write(((a%c)*(b%c))%c+"\n");

        bw.flush();
        bw.close();
    }
}
