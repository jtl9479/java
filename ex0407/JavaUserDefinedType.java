package ex0407;


//사용지 정의 참조 타입 -> 사용자가 선언한 클래스
public class JavaUserDefinedType {

	public static void main(String[] args) {
		
		double lat1 = 3.1423333333333333;
		double lng1 = 3.141111111;
		
		JLocation jl = new JLocation(); //클래스 선언
		
		jl.lat = lat1; //객체 대입
		jl.lng = lng1; //객체 대입
		
		System.out.println(jl.lat);
		System.out.println(jl.lng);
	}
	
}

class JLocation { //사용자가 정의한 참조 타입
	
	public double lat;
	public double lng;
	
}