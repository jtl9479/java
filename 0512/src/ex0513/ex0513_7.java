package ex0513;

import java.util.Scanner;

public class ex0513_7 {

	public static void main(String[] args) {
		// [5][5]배열을 생성한후 1~25까지 숫자를 넣어서 출력하시오 중복 허용 안한다
		// 배열 한개를 만들어서 값을 넣으시오
		Scanner scan = new Scanner(System.in);
		System.out.println("만들고 싶은 1번째 배열을 입력하시오");
		int in_arr1 = scan.nextInt();
		//54 -> [5][4]의 배열을 만들고싶다. 숫자로 받으면 안되고 String으로 받는다. 그리고 나서 char로 쪼개면된다.
		System.out.println("만들고 싶은 2번째 배열을 입력하시오");
		int in_arr2 = scan.nextInt();
		
		
		
		
		//1-25까지의 랜덤 숫자 -> 5,5
		int[] ball = new int[in_arr1*in_arr2];

		for (int i = 0; i < ball.length; i++) {
			ball[i] = i + 1;
		}
		int temp = 0;
		int con = 0;
		int count = 0;
		for (int i = 0; i < ball.length*5; i++) {
			con = (int) (Math.random() * in_arr1*in_arr2); 
			//con은 주소이다 주소를 섞어서 ball[i]의 값을 섞어주는것이다  random이 값을섞는것이다 저기있는 숫자는 값이 아니라 주소값을 의미한다. 배열의 크기와 일치 시켜야한다
			temp = ball[0];
			ball[0] = ball[con];
			ball[con] = temp;
		}

		int[][] num = new int[in_arr1][in_arr2];

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				num[i][j] = ball[i + j *in_arr1]; //num[0][0] 에 ball[0]의 값을 넣어준다 이미 값은 섞여있다
			count ++;
			}
		}
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.print("[" + num[i][j] + "]" + " ");
			}System.out.println();
		}System.out.println("갯수:" + count);
	}
}
