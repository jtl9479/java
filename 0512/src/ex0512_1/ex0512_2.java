package ex0512_1;

import java.util.Scanner;

public class ex0512_2 {

	public static void main(String[] args) {
		//구구단
		//구구단을 몇단부터 몇단 까지 할지를 입력받아서 실행하시오
		//만약에 숫자 크기가 바뀌어도 출력하게 하시오
		Scanner scan = new Scanner(System.in);
		System.out.println("구구단 출력");
		System.out.println("시작 숫자를 입력하시오");
		int num = scan.nextInt();
		System.out.println("마지막 숫자를 입력하시오");
		int num2 = scan.nextInt();
		//입력
		System.out.println("구구단 출력");
		
		
		for(int i=Math.min(num, num2); i<=Math.max(num2, num); i++) { //num보다 크고 num2보다 작을떄 실행한다.
			for(int j=1; j<10; j++) {
				System.out.printf("%d단  %d * %d = %d ",i,i,j,i*j);
			}System.out.println();//줄건너기
			
		}
	}
}
