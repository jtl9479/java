package ex0513;

import java.util.Scanner;
//다차원 배열 중요
public class ex0513_3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String[] name = new String[5];
		int[][] score = new int[5][3];

		// 입력
		for (int i = 0; i < 5; i++) {
			System.out.println("이름을 입력하세요.>>");
			name[i] = scan.next();
			for (int j = 0; j < 3; j++) {
				System.out.println("점수를 입력하세요.>>");
				score[i][j] = scan.nextInt(); //정수가 위치 [0][0] [0][1] [0][2]로 차례대로 값이 저장된다
			}
		}
		// 출력
		for (int i = 0; i < 5; i++) {
			System.out.print(name[i]+"\t");
			for (int j = 0; j < 3; j++) {
				System.out.print(score[i][j]+"\t");
			}System.out.println();
		}

	}
}
