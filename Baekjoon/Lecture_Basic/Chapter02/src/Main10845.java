/**
 * 문제 - 백준 10845 (큐)
 * 메모 - 이 문제를 풀때 시간초과, 런타임에러, 틀렸습니다를 모두 봤다..
 * 1. 시간초과 ? - 처음에 Scanner를 사용했을 때 봤다. 그래서 bufferedreader와 writer로 바꿨다.
 * 2. 런타임에러 ? - queue 배열 크기가 잘못되었던 것 같다. t로 바꿔줬더니 해결되었다.
 * 3. 틀렸습니다. ? - pop에서 숫자 출력을 빼먹었다. 다시 넣어도 틀렸습니다 나오길래 잘 봤더니 이번엔 개행문자를 까먹었다.
 */
import java.io.*;
import java.util.StringTokenizer;

public class Main10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(bf.readLine());
        int queue [] = new int[t];
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
                    bw.write(queue[begin++]+"\n");
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
