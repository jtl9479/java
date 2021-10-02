package back;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class back2741 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(bufferedReader.readLine());
		
		for(int i=1; i<=num; i++) {
			System.out.println(i);
		}
		
	}
}
