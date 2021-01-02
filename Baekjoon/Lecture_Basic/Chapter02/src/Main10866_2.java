/**
 * 문제 - 백준 10866 (덱)
 * 메모 - 큐와 마찬가지로 일차원 배열을 이용했는데, 앞뒤로 모두 요소가 추가될 수 있으니 전체공간을 2t로 하고,
 * begin 포인터와 end 포인터를 중간인 t에 초기화시켰다.
 * ArrayList를 이용한 것 보다 메모리가 크게 나올 것 같았는데 (배열, 구간도 2배니까) 오히려 작게 나왔다.
 * 메모리 19956KB, 시간 248ms
 */

import java.io.*;
import java.util.StringTokenizer;

public class Main10866_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(bf.readLine());
        int deque [] = new int[2*t];

        int begin = t, end =t;
        while(t-->0){
            String str = bf.readLine();
            StringTokenizer st = new StringTokenizer(str);
            String com = st.nextToken();
            if(com.equals("push_front")){
                int x = Integer.parseInt(st.nextToken());
                deque[--begin] = x;

            }
            else if(com.equals("push_back")){
                int x = Integer.parseInt(st.nextToken());
                deque[end++] = x;
            }
            else if(com.equals("pop_front")){
                if (begin==end){
                    bw.write("-1\n");
                }
                else{
                    bw.write(deque[begin++] + "\n");
                }
            }
            else if(com.equals("pop_back")){
                if (begin==end){
                    bw.write("-1\n");
                }
                else {
                    bw.write(deque[end-1] + "\n");
                    end --;
                }
            }
            else if(com.equals("size")){
                bw.write(end-begin + "\n");
            }
            else if(com.equals("empty")){
                if (begin==end){
                    bw.write("1\n" );
                }
                else{
                    bw.write("0\n");
                }
            }
            else if(com.equals("front")){
                if (begin == end){
                    bw.write(-1 + "\n");
                }
                else {
                    bw.write(deque[begin] + "\n");
                }
            }
            else if(com.equals("back")){
                if (begin ==end){
                    bw.write(-1 + "\n");
                }
                else{
                    bw.write(deque[end-1] + "\n");
                }
            }


        }
        bw.flush();
        bw.close();
    }
}