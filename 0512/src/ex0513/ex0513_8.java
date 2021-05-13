package ex0513;

import java.util.Scanner;

public class ex0513_8 {

	public static void main(String[] args) {

		//[0,0][0,1][0,2]  ->이런 모양으로 저장을한다
		//[3][3]의 배열		
		//숫자를 입력받아 원하는 배열을 입력해보세요
		//입력
		
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력해주세여");
		int a = scan.nextInt();
		System.out.println("두번째 숫자를 입력해주세요");
		int b = scan.nextInt();
		
		
		String [][] arr = new String[a+1][b+1];
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j]= "["+i+","+j+"]"; //[0,0],[0,1] 이러한 방법으로 출력이된다
			}
		}
		//출력
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}System.out.println();
		}
	}
}
