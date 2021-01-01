/**
 * 문제 - 백준 1158 (요세푸스 문제 - 큐를 이용하여 풀이)
 * 메모 - 틀렸습니다, 런타임에러를 거쳤다.
 * 1. 틀렸습니다 ? - 예시에 너무 집중해서 k 대신 예시의 수를 넣었다.
 * 2. 런타임에러 ? - 큐 배열의 크기가 문제가 되었던 것 같다. 배열의 크기를 바꾸니 해결되었다.
 * 해결 - 118844KB 412ms
 */

import java.io.*;
import java.util.StringTokenizer;
public class Main1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String tmp = bf.readLine();
        StringTokenizer st = new StringTokenizer(tmp);
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int queue [] = new int [n*n];
        int begin=0, end=n;
        int num=0;
        // 큐에 1~n까지 넣기
        for (int i=0; i<n; i++){
            queue[i]=i+1;
        }

        bw.write("<");
        // 하나씩 push, pop 하기
        while(begin!=end){
            num++;
            if (num%k==0){
                bw.write(queue[begin++]+ "");
                //마지막 >
                if(begin==end){
                    bw.write(">");
                }
                else{   // 그외 ", "
                    bw.write(", ");
                }
            }
            else {
                queue[end++]=queue[begin++];
            }

        }

        bw.flush();
        bw.close();
    }
}
