/**
 * 문제 - 백준 10808 (알파벳개수)
 * 1. String 의 메소드 charAt을 이용해 하나씩 읽는다.
 * 2. 인덱스 값은 문자-'a'를 이용하면 구할 수 있다.
 */

import java.io.*;

public class Main10808 {
    public static void main(String[] args) throws IOException {
        int alphabet[] = new int[26];
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String tmp = bf.readLine();
        for (int i=0; i<tmp.length(); i++){
            char c = tmp.charAt(i);
            int index = c - 'a';
            alphabet[index]++;
        }
        for (int i=0; i<alphabet.length; i++){
            bw.write(alphabet[i] + " ");
        }

        bw.flush();
        bw.close();
    }
}
