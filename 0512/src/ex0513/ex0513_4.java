package ex0513;

import java.util.Scanner;

public class ex0513_4 {

	public static void main(String[] args) {

		// 이름 국어,수학,영어를 입력 받아서
		// 합계를 출력해보세요
		Scanner scan = new Scanner(System.in);
		String[] name = new String[3];
		int[][] score = new int[3][4];

		for (int i = 0; i < 3; i++) {
			System.out.println("이름을 입력하세요");
			name[i] = scan.next();
			for (int j = 0; j < 3; j++) {
				System.out.println("숫자를 입력하세요");
				score[i][j] = scan.nextInt();
				score[i][3] = score[i][0]+score[i][1]+score[i][2];
			}
		}
		for (int i = 0; i < name.length; i++) {
			System.out.print("이름은: " + name[i]);
			for (int j = 0; j < 3; j++) {
				System.out.print("성적 점수는:" + score[i][j]+ " ");
			}System.out.print("합계는:"+score[i][3]);
			System.out.println();
		}

	}
}
