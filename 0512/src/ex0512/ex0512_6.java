package ex0512;

import java.util.Scanner;

public class ex0512_6 {

	public static void main(String[] args) {
		//5명의 학생의 이름 국어 영어 수학 점수를 입력받아 
		//이름 국어 영어 수학 합계 평균을 출력하시오
		Scanner scan =  new Scanner(System.in);
		String [] name = new String[5];
		int [] kor = new int[5];
		int [] eng = new int[5];
		int [] math = new int[5];
		int [] sum = new int[5];
		double [] avg = new double[5];
		
		for(int i=0; i<name.length; i++) {
			System.out.println("이름을 입력하세요");
			name[i] = scan.next();
			System.out.println("국어 점수를 입력하세요");
			kor[i] = scan.nextInt();
			System.out.println("영어 점수를 입력하세요");
			eng[i] = scan.nextInt();
			System.out.println("수학 점수를 입력하세요");
			math[i] = scan.nextInt();
			sum[i] = kor[i]+eng[i]+math[i];
			avg[i] = sum[i]/3.0;
		}
		System.out.println("이름\t 국어\t 영어\t 수학\t 합계\t 평균\t");//상단 출력
		System.out.println("-----------------------------------------------");
		for(int i=0; i<name.length; i++) {
			System.out.printf("이름은 %s \t",name[i]);
			System.out.printf("국어점수는 %d \t",kor[i]);
			System.out.printf("영어점수는 %d \t",eng[i]);
			System.out.printf("수학점수는 %d \t",math[i]);
			System.out.printf("합계는 %d \t",sum[i]);
			System.out.printf("평균는 %.2f \n",avg[i]);
		}
		
	}
}
