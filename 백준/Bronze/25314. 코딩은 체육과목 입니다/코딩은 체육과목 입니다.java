import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int s = n/4;
		String l = "long ";
		String l2 = "";
		for(int i=0;i<s;i++) {
			l2 += l;
		}
		System.out.println(l2 + "int");
	}
}