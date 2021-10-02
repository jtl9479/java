package back;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class back2439 {

	public static void main(String[] args) throws Exception{
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//입력
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));//출력
		
		int star = Integer.parseInt(br.readLine());
		for(int i=1; i<=star; i++) {
			for(int j=star; j>i; j--){
				bw.write(" ");//공백 
			}
			for(int k=0; k<i; k++) {
				bw.write("*");//별
			}
			bw.write("\n");
		}
		
		bw.flush();
		bw.close();
	}
}

