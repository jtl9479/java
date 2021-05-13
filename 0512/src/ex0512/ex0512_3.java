package ex0512;

import java.util.Scanner;

public class ex0512_3 {

	
	//문제 2명의 학생을 출력해보세요
	//학생이름,국어점수,수학점수,영어점수를 입력받아서
	//학생이름,합계,평균을 출력하시오
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("학생이름을 입력하시오");
		String name = scan.next();
		System.out.println("국어점수를 입력하시오");
		int score1 = scan.nextInt();
		System.out.println("수학점수를 입력하시오");
		int score2 = scan.nextInt();
		System.out.println("영어점수를 입력하시오");
		int score3 = scan.nextInt();
	
		double sum = score1+score2+score3;
		double avg = sum/3;
		
		System.out.println("=============================");
		//System.out.println("학생이름은: " + name + " 합계: "+ sum +" 평균은: " +avg);
		System.out.printf("학생이름은: %s 합계는: %.1f 평균은:%.1f" ,name,sum,avg);
	
	
	
	
	
	
	}
}
