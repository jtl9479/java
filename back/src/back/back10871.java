package back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Spliterator;
import java.util.StringTokenizer;

public class back10871 {

	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner(System.in);

		int number = scan.nextInt();
		int number1 = scan.nextInt();
		
		System.out.println(number);
		System.out.println(number1);
		for(int i=0; i<number; i++) {
			int number2 = scan.nextInt();
			if(number1 > number2) {
				System.out.println(number2);
			}
		}
		
		
	}
}
