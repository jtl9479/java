package ex0512_1;

import java.util.Scanner;

public class ex0512_3 {

	public static void main(String[] args) {
		// 로또
		// 입력 6개 for문
		// 출력
		// 봉을 배열로만들고 값을 부여
		// 볼의 값을 섞는다
		// 일치하는지확인
		// 카운트
		// 값 출력

		Scanner scan = new Scanner(System.in);
		int[] num = new int[6];
		int[] ball = new int[45];
		for (int i = 0; i < num.length; i++) {
			System.out.printf("%d번째 숫자를 입력하세요 \n", i + 1);
			num[i] = scan.nextInt();
		}
		System.out.println();
		System.out.println("[내가 선택한 숫자]");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}

		for (int i = 0; i < ball.length; i++) {
			ball[i] = i + 1;
		}

		for (int i = 0; i < 200; i++) {
			int temp = 0;
			int reu = 0;

			reu = (int) (Math.random() * 10);// 값을 섞는다
			temp = ball[0];
			ball[0] = ball[reu];
			ball[reu] = temp;
		}
		System.out.println();

		System.out.println("[ 로또 번호 ]");
		for (int i = 0; i < 6; i++) {
			System.out.print(ball[i] + " ");
		}
		System.out.println();
		int count = 0;
		int[] con = new int[6];
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length; j++) {
				if (num[i] == ball[j]) {
					con[count] = num[i];
					count++;
				}
			}
		}System.out.println("맞춘 갯수: "+ count);
		System.out.print("맞춘 번호: ");
		for(int i=0; i<count; i++) {
			System.out.print(con[i]+ " ");
		}
	}	

}
