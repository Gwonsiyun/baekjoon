import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
		   
		   
		   for(int num1=0;num1<t;num1++) {
			   String result="";
			   int winner=0;
			   int max=0;
			   int sum=0;
			   int count=0;
			   int a = Integer.parseInt(br.readLine());
			   int b[]=new int[a];
			   
			   for(int num2=0;num2<a;num2++) {
				   b[num2] = Integer.parseInt(br.readLine()); 
				   sum+=b[num2];
				   if(max<b[num2]) {
					   max= b[num2];
					   winner=num2+1;
				   }
			   }
			   
			   for(int v:b) {
				   if(max==v) {
					   count++;
				   }
			   }
			   if(count>1) {
				   result= "no winner";
			   }else if(max>sum/2) {
				   result= "majority winner "+winner;
			   }else {
				   result= "minority winner "+winner;
			   }
			   
			   System.out.println(result);
		   }

	}

}
