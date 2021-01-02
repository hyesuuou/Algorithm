/**
 * 문제 - 백준 10866 Deque
 * 메모 - 이 코드에서는 ArrayList를 이용해서 덱을 구현했다.
 * 마지막에 bw.flush() 와 bw.close() 를 잘못된 위치에 넣어가지고 런타임 오류를 봤다. 위치를 수정했더니 해결되었다.
 */

import java.io.*;
import java.util.*;

public class Main10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(bf.readLine());
        ArrayList<Integer> deque = new ArrayList<>();

        while(t-->0){
            String str = bf.readLine();
            StringTokenizer st = new StringTokenizer(str);
            String com = st.nextToken();
            if(com.equals("push_front")){
                int x = Integer.parseInt(st.nextToken());
                deque.add(0,x);

            }
            else if(com.equals("push_back")){
                int x = Integer.parseInt(st.nextToken());
                deque.add(x);
            }
            else if(com.equals("pop_front")){
                if (deque.size()==0){
                    bw.write("-1\n");
                }
                else{
                    bw.write(deque.get(0) + "\n");
                    deque.remove(0);
                }
            }
            else if(com.equals("pop_back")){
                if (deque.size()==0){
                    bw.write("-1\n");
                }
                else {
                    bw.write(deque.get(deque.size()-1) + "\n");
                    deque.remove(deque.size()-1);
                }
            }
            else if(com.equals("size")){
                bw.write(deque.size() + "\n");
            }
            else if(com.equals("empty")){
                if (deque.size()==0){
                    bw.write("1\n" );
                }
                else{
                    bw.write("0\n");
                }
            }
            else if(com.equals("front")){
                if (deque.size()==0){
                    bw.write(-1 + "\n");
                }
                else {
                    bw.write(deque.get(0) + "\n");
                }
            }
            else if(com.equals("back")){
                if (deque.size()==0){
                    bw.write(-1 + "\n");
                }
                else{
                    bw.write(deque.get(deque.size()-1) + "\n");
                }
            }


        }
        bw.flush();
        bw.close();
    }
}
