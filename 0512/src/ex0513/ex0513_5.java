package ex0513;

import java.util.Scanner;

//다차원 배열 합계 구하기
public class ex0513_5 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String[] name = new String[5];
		int[][] score = new int[5][4]; //국어(0,0),영어(0,1),수학(0,2),합계(0,3) 단 합계는 입력을 받지 않는다  
		double[] avg = new double[5];
		// 입력
		for (int i = 0; i < 5; i++) {
			System.out.println("이름을 입력하세요.>>");
			name[i] = scan.next();
			for (int j = 0; j < 3; j++) {
				System.out.println("점수를 입력하세요.>>");
				score[i][j] = scan.nextInt(); //정수가 위치 [0][0] [0][1] [0][2]로 차례대로 값이 저장된다. i,0 i,1 i,2
			}
			//합계
			score[i][3] = score[i][0]+score[i][1]+score[i][2]; //값을 넣어준다.
			avg[i] = score[i][3]/3.0;
		}
		// 출력
		System.out.println("이름\t국어점수\t영어점수\t수학점수\t합계\t평균\t");
		for (int i = 0; i < 5; i++) {
			System.out.print(name[i]+"\t");
			for (int j = 0; j < 4; j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.println(avg[i]+"\t");
			System.out.println();
		}

	}
}
