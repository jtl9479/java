package ex0512;

//로또 만들기 게임
public class ex0512_7 {

	public static void main(String[] args) {
		// 로또는 번호가
		// 로또는 45개의 공을 임의로 뽑아서 5개
		int[] ball = new int[45];// 45개의 공을 변수로 선언한다.

		for (int i = 0; i < ball.length; i++) {
			ball[i] = i + 1; // 볼45개에 숫자값을 넣어준다
			}
		
		// 번호 섞기
		int temp=0;//저장할 변수초기화
		for(int i=0; i<200; i++) {
		//(int)(Math.random()*100) //0~99
		//(int)(Math.random()*200) //-~199
		//(int)(Math.random()*45)+1 //
			int rno = (int)(Math.random()*45);//랜덤 주소를 가지고 왔다 0~44
			temp = ball[0]; //0번 배열값을 먼저 임시저장변수에 저장
			ball[0] = ball[rno];//0번 배열장소에 랜덤숫자를 넣음
			ball[rno] =temp; //ball[0]값을 ball[rno]값에 넣는다
	}//-----------------------------------------------------------------중요
		//출력
		System.out.println("[로또 랜덤 번호 ]");
		for(int i =0; i<6; i++) {
			System.out.print(ball[i]+" ");
		}
		
	}
}
