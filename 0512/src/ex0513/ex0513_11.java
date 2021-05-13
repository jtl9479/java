package ex0513;

import java.util.Scanner;

public class ex0513_11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 1부터 100까지 중 1개의 숫자를 랜덤으로 받아 숫자를 맞추는 프로그램을 구현하시오
		// 현재까지 입력한 숫자들을 마지막에 모두 출력해 보세요
		int randomNo = (int) (Math.random() * 100) + 1; // 1부터 100까지 랜덤
		int count = 0; // 횟수
		int[] input1 = new int[10];
		while (true) {

			if (count >= 10) {//count>9
				System.out.print("");
				count = count - 1; //주석처리 가능
				break;
			}
			System.out.println("숫자를 입력하세요.>>");
			int input = scan.nextInt();

			input1[count] = input;// 입력한수를 inpu1배열에 저장

			if (input == randomNo) {
				System.out.println("정답입니다");
				break;
			} else if (randomNo < input) {
				System.out.println(input + "보다 작습니다");
			} else if (randomNo > input) {
				System.out.println(input + "보다 큽니다");
			}

			count++; //이 부분을 이해해야한다
		}

		System.out.println("정답 : " + randomNo);
		System.out.println("총도전 횟수:" + (count + 1));//정답을 처음에 바로맞췄을때를 대비해서 +1로해준다 처음에 맞추면 배열이0에서 맞춘것이기 때문이다   count를9까지 잡았을경우 +1을 없애준다
		System.out.println("입력한 숫자 : ");
		for (int i = 0; i < (count+1); i++) { //처음에 맞추면 count에 0이 들어가기 때문에 for문에 조건이 성립하지 않아서 에러가 뜨기 때문에 에러를 방지하기 위해 +1를 해준것이다
			System.out.print(input1[i] + "\t");
		}

//===========================================================================	
//		System.out.println("글자를 입력하세요.>>");
//		String input = scan.next();
//		//한국직업전문학교를 입력받아서
//		//전 자만 출력하시오
//		//System.out.println(input.charAt(4));//input.charAt(4)을 준다
//		
//		//입력한 모든 글자를 1글자씩 출력하시오
//		for(int i=0; i<input.length(); i++) {
//			System.out.println(input.charAt(i));
//		}
//		
//		System.out.println(input.substring(4,6)); //0에서4까지 자른다
	}
}
