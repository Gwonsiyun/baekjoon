import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int y = s.nextInt();
        if(y%4==0&&(y%100!=0||y%400==0)){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}
