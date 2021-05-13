package ex0513;

public class ex0513_6 {

	public static void main(String[] args) {
		// 45개의 배열생성
		// 배열의 값을 넣고
		// 섞는다

		// 0에서 9까지 랜덤숫자 행성
		// 배열을 써서 중복값이 없게한다
		int[] ball = new int[9];
		for (int i = 0; i < ball.length; i++) {
			ball[i] = i; // ball에다가 값을 넣기
		}

		int temp = 0;
		int rno = 0;
		for (int i = 0; i < 50; i++) {
			rno = (int) (Math.random() * 9); // 0-9
			temp = ball[0];
			ball[0] = ball[rno];
			ball[rno] = temp;
		}
		int[][] num1 = new int[3][3];
		for (int i = 0; i < num1.length; i++) {
			for (int j = 0; j < num1.length; j++) {// 선언
				num1[i][j] = ball[3 * i + j]; // ball[3*i+j] 를 계산해보면 0,1,2,3,4,5,6,7,8 이나온다

			}

		}
		for (int i = 0; i < num1.length; i++) {
			for (int j = 0; j < num1.length; j++) {// 선언

				System.out.print("[" + num1[i][j] + "]" + " ");

			}
		}
//==============================================================================================

//		//=================================================================================================
//		//배열 [3][3] =1-10까지 랜덤 숫자를 넣어서 출력해보세요
//		//배열 선언
//		//로또번호 배
//		//1차원 배열 ball - 0-9
//		//배열 섞기
//		//ball배열에 있는 것을 arr[3][3]넣기
//		int[][]num1=new int[3][3];
//		int count = 0;
//		int[] ball = new int[9];
//		
//		for(int i=0; i<ball.length; i++) {
//			ball[i]=i+1;
//		}
//		int temp;
//		int con;
//		for(int i=0; i<200; i++) {
//			ball[i]=(int)(Math.random()*9);
//			System.out.println(ball[i]);
//		
//		}
//		
//		
//		
//		for(int i=0; i<num1.length; i++) {
//			for(int j=0; j<num1.length; j++) {//선언
//				num1[i][j] =(int)(Math.random()*10)+1;
//				
//			}
//			
//		}
//		for(int i=0; i<num1.length; i++) {
//			for(int j=0; j<num1.length; j++) {//선언
//				
//				System.out.print("[" + num1[i][j] + "]"+ " ");
//				count ++;
//			}
//			
//		}System.out.print("count 횟수:"+count);
//		

//=========================================================================		
		// 문제[7] 을 넣어서 1-10사이에 있는 랜덤숫자를 넣어보시오
		// 중복 가능
//		int[]num = new int[7];
//		int count = 0;
//		for(int i=0; i<num.length; i++) {
//			num[i] =(int)(Math.random()*10)+1;
//		}
//		
//		for(int i=0; i<num.length; i++) {
//			count++;
//			System.out.print("["+num[i]+"]");
//			
//		}System.out.print(count);
//		
	}
}
