import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int result = n;
        int cycle = 0;
        do{
            int a = n/10;
            int b = n%10;
            int sum = a+b;
            int c = sum%10;
            n = (b*10)+c;
            cycle++;
        }while(n!=result);
        System.out.println(cycle);
    }
}
