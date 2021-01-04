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
