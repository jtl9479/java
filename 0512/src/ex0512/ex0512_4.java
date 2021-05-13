package ex0512;

public class ex0512_4 {

	public static void main(String[] args) {
		
//		double a = 5.2345677;
//		int b = 100;
//		System.out.println("print 출력: " + a + ","+b);
//		System.out.printf("printf 출력: %f\n%d \n",a,b); //%f
//		System.out.printf("printf 출력: %f,%d ",a,b);
		
		//구구단 출력 뒷자리는 홀수번만 출력하게 한다
		System.out.println("구구단 홀수번만 출력을 한다");
		int i = 0;
		int j =0;
		 for(i=2; i<10; i++) {
			System.out.printf("%d 단: \t",i);
			for(j=1; j<10; j++) {
				if(j>5) {
					//continue;
					break;
				}
				System.out.printf("%d * %d : %d \t",i,j,i*j);
			}System.out.println();
		}
		
	}
}
