import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		int h = scanner.nextInt();
		
		int m = scanner.nextInt();
		
		int temp = m-45;
		if(temp<0) {
			if(h==0) {
				h = 23;
			}else {
				h--;
			}
			temp = 60 + temp;
		}
		
		System.out.println(h+" "+temp);
		
		scanner.close();
	}

}
