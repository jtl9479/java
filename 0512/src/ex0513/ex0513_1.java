package ex0513;

import java.util.Scanner;

public class ex0513_1 {

	public static void main(String[] args) {
		//학생성적 프로그램 - 3명 입력해서 출력해보세요
		//이름,국어,영어,수학을 입력받아 이름,국어,영어,수학,합계,평균을 구하시오
		
		
		Scanner scan = new Scanner(System.in);
		String[] name = new String[3];
		int[] kor = new int[3];
		int[] eng = new int[3];
		int[] math = new int[3];
		int[] sum = new int[3];
		double[] avg = new double[3];
		
		
		for(int i=0; i<name.length; i++) {
			System.out.println("이름을 입력하세요");
			name[i] = scan.next();
			System.out.println("국어점수를 입력하세요");
			kor[i] = scan.nextInt();
			System.out.println("영어점수를 입력하세요");
			eng[i] = scan.nextInt();
			System.out.println("수학점수를 입력하세요");
			math[i] = scan.nextInt();
			sum[i] = kor[i]+eng[i]+math[i];
			avg[i] = sum[i]/3.0;
		}
		for(int i=0; i<name.length; i++) {
			System.out.printf("이름::%s 국어점수:%d 영어점수:%d 수학점수:%d 합계:%d 평균:%.2f \n",name[i],kor[i],eng[i],math[i],sum[i],avg[i]);
		}
		
	}
}
