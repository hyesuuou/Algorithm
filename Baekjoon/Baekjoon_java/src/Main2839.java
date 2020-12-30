import java.util.Scanner;

public class Main2839 {
    public static void main(String[] args) {
        int x,y ;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n%15==0){
            y = n/5; x = (n%5)/3;
            System.out.println(x + y);
        }
        else if (n%3 ==0 && n%5 !=0){
            x = n/3;
            System.out.println(x);
        }
        else if (n%3 !=0 && n%5 ==0){
            y = n/5;
            System.out.println(y);
        }
        else {
            System.out.println(-1);
        }


        scanner.close();
    }
}
