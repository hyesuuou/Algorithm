/**
 * 문제 - 백준 1978 (소수찾기)
 * 메모 - bool값을 이용해보기, 따로 함수 만들기도 해봐야지
 * count++ 를 잘못 갖다놔서 틀렸다. while문 이름붙이기도 사용했다.
 */

import java.io.*;
import java.util.StringTokenizer;

public class Main1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        String tmp = bf.readLine();
        StringTokenizer st = new StringTokenizer(tmp);
        int count =0;

        w1:
        while (n-->0){
             int num = Integer.parseInt(st.nextToken());
             if (num < 2){
                 continue;
             }
             else{
                 for (int i=2; i*i<=num; i++){
                     if (num%i==0){
                        continue w1;
                     }
                 }
                 // 없으면
                 count++;
             }
        }
        bw.write(count+"");
        bw.flush();
        bw.close();
    }
}
