package ex0512;

import java.util.Scanner;

public class ex0512_10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] input = new int[6];

		for (int i = 0; i < input.length; i++) {
			System.out.println((i + 1) + "번째 숫자를 입력하세요");
			input[i] = scan.nextInt();
		} // 번호 입력 받기
		System.out.println("내가 입력한 번호 출력");
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + "  ");
		} // 번호 출력 받기
		System.out.println();

		// --------------------------------------------------------번호 입출력
		// 로또번호배열 45개 생성
		int[] ball = new int[45];
		// 번호 넣기
		for (int i = 0; i < ball.length; i++) {// ball.length는 45와 같다
			ball[i] = i + 1; // 순차적으로 0부터 들어가기 때문에 +1을 해줘서 1부터 시작을할수있게한다
		}
		// 3.번호 섞기 랜덤활용
		for (int i = 0; i < 200; i++) {// 숫자가 바뀌는 행동을 200번한다
			int temp = 0; // 임시저장소
			int randomNo = 0; // 랜덤주소변수
			randomNo = (int) (Math.random() * 15);// 랜덤
			// 0번방과 랜덤방 값변경
			temp = ball[0];
			ball[0] = ball[randomNo];
			ball[randomNo] = temp; // 트라이앵글 숫자가 바뀐다.
		}
		// 4.로또번호 출력
		System.out.println("[ 로또 번호 ]");
		for (int i = 0; i < 6; i++) {
			System.out.print(ball[i] + " ");
		}
		System.out.println();
		// 비교
		int count = 0;
		int[] win = new int[6]; // 당첨번호배열
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (input[i] == ball[j]) {
					win[count] = input[i]; // 당첨번호를 당첨배열에 저장
					count++; // input 과 ball 이 맞으면 카운팅이 된다

				}
			}

		}
		System.out.println("[당첨된 번호 개수:" + count + " 개]");
		System.out.println("[당첨 번호]");
		for (int i = 0; i < count; i++) {
			System.out.print(win[i]+ " ");

		}
		System.out.println();
	}

}
