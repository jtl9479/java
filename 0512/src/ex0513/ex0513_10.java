package ex0513;

import java.util.Scanner;
//보물찾기 게임
public class ex0513_10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//보물 게임
		//배열 2개 생성
		int [][] tr1 = new int[5][5]; //0또는1 값이 들어가는 배열
		String [][] tr2 = new String[5][5]; //보물 또는 꽝이 들어가는 배열
		
		int [] ball = new int[25];
		ball[0]=1; 
		ball[1]=1;
		ball[2]=1; //좌표값이 1이면 보물 아니면 0
		int temp =0;
		int con = 0;
		for(int i=0; i<200; i++) {
			con = (int)(Math.random()*25);
			temp=ball[0];
			ball[0]=ball[con];
			ball[con]=temp; //랜덤
		}
		//tr1[i][j] = 0또는 1이 들어감
		int count = 0;
		for(int i=0; i<tr1.length; i++) {
			for(int j=0; j<tr1[i].length; j++) {
				tr1[i][j] = ball[count];
				count++;
			}
		}
		//무한 반복
		while(true) {
			//출력
			System.out.println("번호\t[0]\t[1]\t[2]\t[3]\t[4]");
			for(int i=0;i<tr2.length;i++) {
				System.out.print("[" +i+"]\t");
				for(int j=0;j<tr2.length;j++) {
					System.out.print(tr2[i][j]+"\t");
				}
				System.out.println();
			}
			System.out.println("1번째 좌표(예시:12) : "); //string은 쪼갤수 있다 int는 쪼갤수앖다
			String input = scan.next();
			int input1 = input.charAt(0)-'0'; //0의자리를 가져온다
			int input2 = input.charAt(1)-'0'; //1의자리를 가져온다
			
			if(tr1[input1][input2]==1) {
				tr2[input1][input2] = "보물";
			}else {
				tr2[input1][input2] = "꽝";
			}
		}
		
//======================================================================================================================
//		Scanner scan = new Scanner(System.in);
//		//보물 게임
//		//배열 2개 생성
//		int [][] tr1 = new int[5][5]; //0또는1 값이 들어가는 배열
//		String [][] tr2 = new String[5][5]; //보물 또는 꽝이 들어가는 배열
//		
//		int [] ball = new int[25];
//		ball[0]=1; 
//		ball[1]=1;
//		ball[2]=1; //좌표값이 1이면 보물 아니면 0
//		int temp =0;
//		int con = 0;
//		for(int i=0; i<200; i++) {
//			con = (int)(Math.random()*25);
//			temp=ball[0];
//			ball[0]=ball[con];
//			ball[con]=temp; //랜덤
//		}
//		//tr1[i][j] = 0또는 1이 들어감
//		int count = 0;
//		for(int i=0; i<tr1.length; i++) {
//			for(int j=0; j<tr1[i].length; j++) {
//				tr1[i][j] = ball[count];
//				count++;
//			}
//		}
//		//무한 반복
//		while(true) {
//			//출력
//			System.out.println("번호\t[0]\t[1]\t[2]\t[3]\t[4]");
//			for(int i=0;i<tr2.length;i++) {
//				System.out.print("[" +i+"]\t");
//				for(int j=0;j<tr2.length;j++) {
//					System.out.print(tr2[i][j]+"\t");
//				}
//				System.out.println();
//			}
//			System.out.println("1번째 좌표 : ");
//			int input1 = scan.nextInt();
//			System.out.println("2번째 좌표 : ");
//			int input2 = scan.nextInt();
//			
//			if(tr1[input1][input2]==1) {
//				tr2[input1][input2] = "보물";
//			}else {
//				tr2[input1][input2] = "꽝";
//			}
//		}
	}
}
