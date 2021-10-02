package back;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class back11021 {

	public static void main(String[] args) throws Exception {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(bufferedReader.readLine());
		
		for(int i=1; i<=num; i++) {
			
			StringTokenizer st = new StringTokenizer(bufferedReader.readLine()," ");
			
			int num1 = Integer.parseInt(st.nextToken());
			int num2 = Integer.parseInt(st.nextToken());
			int sum = num1+num2;
			String sum1 = Integer.toString(sum);
			
			bufferedWriter.write("Case #"+i+": "+ sum1 +"\n");
		}
		
		bufferedWriter.flush();
		bufferedWriter.close();
		
	}
}
