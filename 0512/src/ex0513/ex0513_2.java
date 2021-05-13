package ex0513;

import java.util.Scanner;

public class ex0513_2 {

	public static void main(String[] args) {
		//char [] hex = {'C','A','F','E'};//값을 넣음 12,10,15,14 ->16진수
		Scanner scan = new Scanner(System.in);
		System.out.println("16진수 영문을 입력하시오.(A-F)>>");
		char hex = scan.next().charAt(0);
		String[] octal= {"0","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"};
		
		String result="";
		int temp=0;
		for(int i=0; ;i++) {
			//문자 5를 수자 5로 취환하는 방법 '5'-'0'=5 아스키 코드
			//temp = hex[0]-'0'; //temp에는 5가 들어간다  (숫자일때만)
			//System.out.println(octal[temp]);
			// 0은 아스키 코드로 -48 대문자A=65, C=67  A-C=2+10=12
			//hex[1]-'A'+10  -> 12출력 (문자일때만)
			//문자만 들어온다고 가정했을때
			System.out.println(hex-'A'+10);//hex[i]의 값을 아스키코드로변환하고 'A'또한 아스키코드로 변환한뒤 계산을 시작한다.
			System.out.println(octal[hex-'A'+10]);//위에 값다 같다 16진수 문자열을 숫자로 표현하는법.
		}
		
	}
}
