import java.util.Scanner;

public class Main10773 {
    public static void main(String[] args) {
        int sum=0, ptr=0;
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int[] st = new int[k];

        for (int i=0; i<k; i++){
            int num = scanner.nextInt();
            if (num==0){
                ptr--;
            }
            else {
                st[ptr]=num;
                ptr++;
            }
        }
        // 출력
        for(int i=0; i<ptr; i++){
            sum += st[i];
        }
        System.out.println(sum);

    }

}
