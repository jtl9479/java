package ex0513;

import java.util.Scanner;

public class ex0513_9 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);// 입력문

		int[] num1 = new int[25];// 중복값을 제거하기 위해 1차원 배열에다가 값을 전달한다.
		for (int i = 0; i < num1.length; i++) {
			num1[i] = i + 1; // 배열에다가 값을 넣는 과정
		}

		int temp = 0; // 임시값 트라이 앵글
		int con = 0; // 랜덤 주소값이 들어갈 변수
		for (int i = 0; i < 30; i++) { // i번의 횟수만큼 섞는다
			con = (int) (Math.random() * 25); // 값을 섞는것이 아니라 주소 값을 섞는것이다
			temp = num1[0]; // 임시값에다가 num1[0]의 값을 넣는다
			num1[0] = num1[con]; // num1[0]에다가num[con]의 값을 넣는다
			num1[con] = temp; // num1[con]에다가 temp를 넣는다
		}
		// 중복 제거를 위한 과정

		int[][] num = new int[5][5]; // 2중 배열 생성
		int count = 0;
		for (int i = 0; i < num.length; i++) { // 2중 배열은 for문을 2개써야한다 3개일떄는 3개.....
			for (int j = 0; j < num[i].length; j++) {
				num[i][j] = num1[count]; // 이것 이해할것 num1[]의 값을 num[][]에게 값을 전달한다 저기는 주소다 값은 보이지 않는다
				count++;
			}
		}

		// 무한반복
		while (true) {
			// 배열 출력
			System.out.print("번호\t[0]\t[1]\t[2]\t[3]\t[4]\n");
			System.out.println("-----------------------------------------------");
			for (int i = 0; i < num.length; i++) {
				System.out.print("[" + i + "]\t");
				for (int j = 0; j < num[i].length; j++) {
					System.out.print(num[i][j] + "\t"); // 출력
				}
				System.out.println();
			}
			// 번호 입력
			System.out.println("0-4까지 숫자를 입력하세요.>>");
			int input1 = scan.nextInt();
			System.out.println("0-4까지 숫자를 입력하세요.>>");
			int input2 = scan.nextInt();

			num[input1][input2] = 0; // num[][]값에 value 0을 지정해준다

			System.out.print("입력 : " + input1 + "," + input2 + "\n");

		}

//-------------------------------------------------------------------------------------------------------------------------------
		// [5][5]배열 1부터25까지 랜덤으로 숫자를 넣어서 출력하시오.

//		int[] num1 = new int[25];//중복값을 제거하기 위해 1차원 배열에다가 값을 전달한다.
//		for (int i = 0; i < num1.length; i++) {
//			num1[i] = i + 1; //배열에다가 값을 넣는 과정
//		}
//
//		int temp = 0; //임시값 트라이 앵글
//		int con = 0; //랜덤 주소값이 들어갈 변수
//		for (int i = 0; i < 30; i++) { //i번의 횟수만큼 섞는다
//			con = (int) (Math.random() * 25); //값을 섞는것이 아니라 주소 값을 섞는것이다
//			temp = num1[0]; //임시값에다가 num1[0]의 값을 넣는다
//			num1[0] = num1[con]; //num1[0]에다가num[con]의 값을 넣는다
//			num1[con] = temp; //num1[con]에다가 temp를 넣는다
//		}
//		//중복 제거를 위한 과정
//		
//		int[][] num = new int[5][5]; //2중 배열 생성 
//		int count =0;
//		for (int i = 0; i < num.length; i++) {  //2중 배열은 for문을 2개써야한다 3개일떄는 3개.....
//			for (int j = 0; j < num[i].length; j++) {
//				num[i][j] = num1[count]; // 이것 이해할것  num1[]의 값을 num[][]에게 값을 전달한다  저기는 주소다 값은 보이지 않는다
//				count++;
//			}
//		}
//		//출력
//		System.out.print("번호\t[0]\t[1]\t[2]\t[3]\t[4]\n");
//		System.out.println("-----------------------------------------------");
//		for (int i = 0; i < num.length; i++) {
//			System.out.print("[" + i + "]\t");
//			for (int j = 0; j < num[i].length; j++) {
//				System.out.print(num[i][j] + "\t"); //출력
//			}
//			System.out.println();
//		}
	}// main
}// class
