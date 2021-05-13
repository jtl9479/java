package ex0512;

import java.util.Scanner;

public class ex0512_2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("몇단에서 몇단까지 계산할까요");
		System.out.println("시작할 단을 입력해주세요");
		int num1 = scan.nextInt();
		System.out.println("끝낼 단을 입력해주세요");
		int num = scan.nextInt();

//		if (num < num1) {
//			for (int i = num; i <= num1; i++) {
//				System.out.print(i + "단" + "\t");
//				for (int j = 1; j <= 9; j++) {
//					System.out.print(i + "*" + j + "=" + i * j + "\t");
//				}
//				System.out.println();
//			}
		if(num < num1) {
			int a =0;	//변수 추가 안하면 시작 값과 끝값이 같아진다
			a = num1; 	//a에 시작값을 저장한다
			num1 = num; //시작값에 끝 값을 저장한다 그러면 시작 값에 대한 값이 변경된다
			num = a;	//끝값에다가 변수a에 저장됬던 값을 보낸다 그러면 2개에 대한 값이 변경이 된다. 중요
			//변수를 하나 추가한다 변수를 추가안하면
			//num1 과 num의 값이 같아진다 그렇기 때문에 그것을 방지하기 위해서 변수를 넣어준다
		}
		Math.ceil(2.015); //올림
		Math.round(2.015);//반올림
		Math.floor(2.015);//버림
		int num2 = (int)(Math.random()*100)+1;//랜덤 1부터 100까지 의 랜덤값을 출력한다
		Math.max(10,2);//큰수를 출력한다
		Math.min(20, 4);//작은수를 출력한다
			
		for (int i = Math.min(num, num1); i <= Math.max(num, num1); i++) { // 또는  Math.max(10,2); ,Math.min(20, 4); 에 다가 변수를 주어도 된다 int input = Math.max(num, num1); int input1 = Math.min(num, num1);
			System.out.print(i + "단" + "\t");
			for (int j = 1; j <= 9; j++) {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
//		for (int i = num1; i <= num; i++) {
//				System.out.print(i + "단" + "\t");
//				for (int j = 1; j <= 9; j++) {
//					System.out.print(i + "*" + j + "=" + i * j + "\t");
//				}
//				System.out.println();
//			}
		}

	}

