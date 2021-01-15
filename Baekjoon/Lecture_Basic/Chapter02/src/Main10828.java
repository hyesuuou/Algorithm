/**
 * 문제 - 백준 10828 (스택)
 */

import java.io.*;
import java.util.StringTokenizer;

public class Main10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(bf.readLine());
        int stack[] = new int[t];
        int top=-1;
        while (t-->0){
            String tmp = bf.readLine();
            StringTokenizer st = new StringTokenizer(tmp);
            String command = st.nextToken();
            if (command.equals("push")){
                int num = Integer.parseInt(st.nextToken());
                stack[++top]=num;
            }
            else if (command.equals("pop")){
                if (top == -1){
                    bw.write(-1+"\n");
                }
                else {
                    bw.write(stack[top--] + "\n");
                }
            }
            else if (command.equals("size")){
                bw.write((top+1)+"\n");
            }
            else if (command.equals("empty")){
                if (top == -1){
                    bw.write(1 + "\n");
                }
                else {
                    bw.write(0+"\n");
                }
            }
            else if(command.equals("top")){
                if (top == -1){
                    bw.write(-1+"\n");
                }
                else{
                    bw.write(stack[top]+"\n");
                }
            }
        }
        bw.flush();
        bw.close();


    }
}
