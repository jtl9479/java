package ex0513;

import java.util.Scanner;

public class ex0513_12 {

	public static void main(String[] args) {
		//이름,국어점수,영어점수,수학점수를 입력받아 ->이름 국어 영어 수학 합계 평균 을 출력하시오
		//학생은 5명 국어,영어,수학,합계->2차원배열을 쓰시오
		// 입력은 scanner
		//학생은 1차원배열 [5]
		//국어,영어,수학,합계,평균->2차원배열 [5][5]
		Scanner scan = new Scanner(System.in);
		String[] name = new String[5];
		int[][] score = new int[5][4];
		double[] avg = new double[5];
		
		for(int i=0; i<name.length; i++) {
			System.out.println("이름을 입력하시오");
			name[i] = scan.next();
			for(int j=0; j<3; j++) {
				System.out.println("점수를 입력하시오");
				score[i][j] = scan.nextInt();
				
			}score[i][3] = score[i][0]+score[i][1]+score[i][2];
			
			avg[i] = score[i][3]/3.0;
		}
		System.out.println("이름\t국어점수\t영어점수\t수학점수\t합계\t평균\t");
		for(int i=0; i<name.length; i++) {
			System.out.print(name[i]+"\t");
			for(int j=0; j<4; j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.printf("%.2f",avg[i]);
			System.out.println();
		}
	}
}
