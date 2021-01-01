/**
 * 문제 - 백준 10845 (큐)
 * 메모 - 시간초과가 났다..
 */
import java.io.*;
import java.util.StringTokenizer;

public class Main10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(bf.readLine());
        int queue [] = new int[100];
        int begin = 0, end =0;

        while (t-- >0){
            String str = bf.readLine();
            StringTokenizer st = new StringTokenizer(str);
            String com = st.nextToken();
            if (com.equals("push")){
                int x = Integer.parseInt(st.nextToken());
                queue[end++] = x;
            }
            else if(com.equals("pop")){
                if (begin==end){
                    bw.write("-1\n");
                }
                else{
                    queue[begin++]=0;
                }
            }
            else if (com.equals("size")){
                bw.write(end-begin + "\n");
            }
            else if (com.equals("empty")){
                if(begin==end){
                    bw.write("1\n");
                }
                else{
                    bw.write("0\n");
                }
            }
            else if (com.equals("front")){
                if(begin==end){
                    bw.write("-1\n");
                }
                else{
                    bw.write(queue[begin] + "\n");

                }
            }
            else if(com.equals("back")){
                if(begin==end){
                    bw.write("-1\n");
                }
                else{
                    bw.write(queue[end-1]+ "\n");
                }
            }

        }
        bw.flush();
        bw.close();

    }
}
