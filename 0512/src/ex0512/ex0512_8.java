package ex0512;

import java.util.Scanner;

public class ex0512_8 {

	public static void main(String[] args) {
		//로또 번호1에서 45번까지 6개를 입력하라
		//로또번호 6개와 입력한 6개를 출력하시오
		
		Scanner scan = new Scanner(System.in);
		int[] input = new int[6];
		for (int i = 0; i < input.length; i++) {
			System.out.print((i + 1) + "번째 숫자를 입력하세요");
			input[i] = scan.nextInt();
		} // 번호 입력 받기
		System.out.println("내가 입력한 번호 출력");
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + "  ");
		} // 번호 출력 받기
//		
//		Scanner scan = new Scanner(System.in);
//		int[] input = new int[6];
//		for (int i = 0; i < input.length; i++) {
//			//System.out.println((i + 1) + "번째 숫자를 입력하세요");
//			input[i] = scan.nextInt();
//			System.out.print(input[i] + "  ");
//		} // 번호 입력 받기
//		
		
		
		
	}
}
