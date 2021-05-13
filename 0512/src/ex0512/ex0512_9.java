package ex0512;

import java.util.Scanner;

public class ex0512_9 {
	
	// 3개를 입력받아 출력하고
			// 로또번호 3개를 출력해보세요
			// 1. 3개 입력받아 출력
			// 2. 로또번호 배열생성
			// 3. 로또번호 순차적으로 값넣기
			// 4. 로또번호 섞기
			// 5. 로또번호 3개 출력하기
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("번호를 입력하세요");

		int num[] = new int[6];
		int a = 0;
		for (int i = 0; i < num.length; i++) {
			num[i] = scan.nextInt();
		}
		System.out.println("내가 입력한 번호");
		for (int i = 0; i < num.length; i++) {
			
			System.out.print(num[i]+" ");
		}
		
		System.out.println();

		int[] ball = new int[45];// 45개의 공을 변수로 선언한다.

		for (int i = 0; i < ball.length; i++) {
			ball[i] = i + 1; // 볼45개에 숫자값을 넣어준다
		}

		// 번호 섞기
		int temp = 0;// 저장할 변수초기화
		for (int i = 0; i < 200; i++) {
			int rno = (int) (Math.random() * 45);// 랜덤 주소를 가지고 왔다 0~44
			temp = ball[0]; // 0번 배열값을 먼저 임시저장변수에 저장
			ball[0] = ball[rno];// 0번 배열장소에 랜덤숫자를 넣음
			ball[rno] = temp; // ball[0]값을 ball[rno]값에 넣는다
		} // -----------------------------------------------------------------중요
			// 출력
		System.out.println("[로또 랜덤 번호 ]");
		for (int i = 0; i < 6; i++) {
			System.out.print(ball[i] + " ");
		}
		
		int count = 0;
		for(int i=0; i<6; i++) {
			for(int j=0; j<6; j++) {
				if(num[i]==ball[j]) {
					count += count;
					System.out.println("맞은 번호는" +i +count );
				}else {
				System.out.println("맞은번호가 없습니다");
			}
			}
		}
		
		

	}
}