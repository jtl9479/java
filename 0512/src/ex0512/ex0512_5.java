package ex0512;

import java.util.Scanner;

//배열
public class ex0512_5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		//배열 korea 5개 만들어서 100점을 모두다 넣어주세요
		
		String [] name = new String[3];
		int [] korea = new int[3];
		int [] eng = new int[3];
		int [] math = new int[3];
		int [] total = new int[3];
		double [] avg = new double[3]; //배열을 선언해준다
		
		
		for(int i=0; i<name.length; i++) {  //--> 만약 배열의 length가 다를 경우에는 각자각자 돌려야한다. 그런한 경우는 흔하지 않다
			System.out.println("이름을 입력하세요");
			name[i]=scan.next(); //입력한값이 배열로 들어가게한다
			System.out.println("국어점수을 입력하세요");
			korea[i]=scan.nextInt(); //입력한값이 배열로 들어가게한다
			System.out.println("영어점수을 입력하세요");
			eng[i]=scan.nextInt(); //입력한값이 배열로 들어가게한다
			System.out.println("수학점수을 입력하세요");
			math[i]=scan.nextInt(); //입력한값이 배열로 들어가게한다
			total[i] = korea[i]+eng[i]+math[i];
			avg[i] = total[i]/3.0;
		
		
		}
		for(int i=0; i<name.length; i++) {
			System.out.print(name[i]+"\t");
			System.out.print(korea[i]+"\t");
			System.out.print(eng[i]+"\t");
			System.out.print(math[i]+"\t");
			System.out.print(total[i]+"\t");
			System.out.printf("%.2f \n",avg[i]);
			
		}
		
//		System.out.println("이름을 입력하세요");
//		name[0]=scan.next(); //입력한값이 배열로 들어가게한다
//		System.out.println("이름을 입력하세요");
//		name[1]=scan.next(); //입력한값이 배열로 들어가게한다
//		System.out.println("이름을 입력하세요");
//		name[2]=scan.next(); //입력한값이 배열로 들어가게한다
//		
//		System.out.println(name[0]);
		
		
		
		
		
		
		
		
		
		
		//		System.out.printf("배열의 크기는 %d 이며 \n",korea.length);
//		for(int i=0; i<korea.length; i++) {
//			korea[i]= 100;
//			System.out.printf("배열의 값은 %d 이다 \n",korea[i]);
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int [] score1 = new int[6];
//		score1[0] = 100;
//		score1[1] = 90;
//		score1[2] = 80;
//		score1[3] = 70;
//		score1[4] = 60;
//		score1[5] = 50;
		
//		int [] score = {100,90,80,70,60,50,40};
//
//		for(int i =0; i<score.length; i++) {
//			System.out.println(score[i]);
//		}
		
//		int num = 0;
//		int [] score = new int[5]; //객체 5개가 만들어졌다
//		score[0] = 1;
//		score[1] = 2;
//		score[2] = 3;
//		score[3] = 4;
//		score[4] = 5; //객체에 정보를 넣고있다.
//		
//		if(score.equals(1)) {//주소값을 넣어줘야한다
//			System.out.println("score[0]의 값은 1입니다"); 
//		}
//		
//		
//		System.out.println(score[0]);//score[0]이 출력된다 
	
	
		//number int 배열 3개를 선언해서 1~3까지 입력하시오
		
//		int [] number = new int[3]; 
//		//배열의 갯수를 지정해주고 코딩할때 배열을 벗나면 프로그램에는 에러가 표시가 안되지만 컴파일하면 에러가 난다. 실행을 해줄때만 에러가 난다.
//		number[0]=1;
//		number[1]=2;
//		number[2]=3; //선언1
//		
//		int[] number2= {1,2,3}; //이렇게 선언해도된다 선언2
//		
//		int [] num = new int[100];
//		for(int i=0; i<100; i++) {
//			num[i]=i+1;//배열을 값에 저장한다
//		}
//		for(int i=0; i<100; i++) {
//			System.out.println(num[i]);// 배열의 값을 보여준다
//		}
//		
//		
//		System.out.println(number);
		
	
	}
}
