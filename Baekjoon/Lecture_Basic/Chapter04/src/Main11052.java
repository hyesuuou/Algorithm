import java.io.*;
import java.util.StringTokenizer;

public class Main11052 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        int[] p = new int [n + 1];
        String tmp = bf.readLine();
        StringTokenizer st = new StringTokenizer(tmp);
        for (int i = 1; i <= n; i++) {
            p[i] = Integer.parseInt(st.nextToken());
        }
        // 현재까지 배열 p에 각각 가격 저장(인덱스: 들어있는 카드 몇장인지)
        bw.write(card(n, p) + "");

        bw.flush();
        bw.close();

    }

    static int card(int n, int[] p) {
        int[] d = new int[n + 1];
        if (n == 1) {
            return p[1];
        }
        if (d[n] > 0) return d[n];

        for (int i = 1; i < n + 1; i++) {
            if (d[n] < card(n - i, p) + p[i])
                d[n] = card(n - i, p) + p[i];
        }

        return d[n];

    }
}
