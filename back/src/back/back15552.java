package back;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class back15552 {

	public static void main(String[] args) throws IOException { 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


		int count = Integer.parseInt(br.readLine());//String 으로 받아서 int 로 형변환을 해준다
		
		
		
		for(int i=0; i<count; i++) {
			

			StringTokenizer st = new StringTokenizer(br.readLine()," ");

			
			bw.write((Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()))+"\n");

		
		}
			br.close();
		
			bw.flush();
			bw.close();
	}
}
