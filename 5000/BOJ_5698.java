import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		  
		boolean abc = true;
		
		while (abc) {
			String t = br.readLine();
			if(t.equals("*")) {
				abc= false;
				break;
			}
			String[] str;
			str=t.split(" ");
			String first_str = "";
			char result='Y';
			for(int i=0; i<str.length; i++) {
				if(i==0) {
					first_str=str[i].substring(0, 1).toUpperCase();
					continue;
				}
				String temp=str[i].substring(0, 1).toUpperCase();
				if(!first_str.equals(temp)) {
					result='N';
				}
			}
			System.out.println(result);
		}
	}
}
