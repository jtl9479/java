package ex0512;

import java.util.Scanner;

public class ex0512_11 {
//일단 다외우자
	public static void main(String[] args) {
		//6개 입력받아 출력하고
		//로또번호 배열 생성
		//로또번호 순차적으로 번호 넣기
		//로또번호 섞기
		//로또번호 6개 출력하기
		//당첨번호 개수 출력
		//당첨번호 출력
		
		Scanner scan = new Scanner(System.in);
		int[] num = new int[6];
		
		for(int i=0; i<num.length; i++) {
			System.out.println((i+1)+"번째의 숫자를 입력하세요");
			num[i]=scan.nextInt();
			
		}System.out.println("[내가 쓴 번호]");
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i]+" ");
		}//번호 출력
		System.out.println();
		
		int[] ball= new int[45]; //번호 배열 생성
		for(int i=0; i<ball.length; i++) {
			ball[i]=i+1;
		}//순차적으로 번호 넣기
		
		for(int i=0; i<200; i++) {
			int temp =0; //임시저장소
			int randomNo = 0; // 랜덤주소변수
			randomNo = (int) (Math.random() * 10);// 랜덤
			temp = ball[0];
			ball[0] = ball[randomNo];
			ball[randomNo] = temp;
			
		}
		System.out.println("로또 번호");
		for(int i=0; i<6; i++) {
			System.out.print(ball[i]+" ");
		}
		System.out.println();
		int count = 0;
		int[] con = new int[6];
		for(int i=0; i<6; i++) {
			for(int j=0; j<6; j++) {
				if(num[i] == ball[j]) {
					con[count] = num[i];
					count++;
				
					
				}
			}
			
		}
		System.out.println("맞은 갯수: "+ count);
		System.out.println("[당첨 번호]");
		for(int i=0; i<count; i++) {
			System.out.print(con[i]+ " ");//반복문을 넣어서 2개이상 맞췄을때를 대비한다
		}
		
		
	}
}
