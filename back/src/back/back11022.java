package back;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class back11022 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int limitnum = Integer.parseInt(bufferedReader.readLine());
		
		for(int i=1; i<=limitnum; i++) {
			
			
			
			StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine()," ");
			
			int num1 = Integer.parseInt(stringTokenizer.nextToken());
			int num2 = Integer.parseInt(stringTokenizer.nextToken());
			int sum = num1 + num2;
			
			bufferedWriter.write("Case #"+i+": "+num1+" + "+num2+" = "+sum+"\n");
			
		}
		
		bufferedWriter.flush();
		bufferedWriter.close();
	}
}
