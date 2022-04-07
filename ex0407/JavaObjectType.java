package ex0407;

import java.util.Calendar;
import java.util.Date;

/*
 * API(application progamming interface)란
 * 컴퓨터나 컴퓨터 프로그램 사이의 연결이다.
 * 일종의 소프트웨어 인터페이스이며 다른 종류의 소프트웨어에 서비스를 제공한다.
 * 
 * https://blog.wishket.com/api%EB%9E%80-%EC%89%BD%EA%B2%8C-%EC%84%A4%EB%AA%85-%EA%B7%B8%EB%A6%B0%ED%81%B4%EB%9D%BC%EC%9D%B4%EC%96%B8%ED%8A%B8/
 * https://blog.wishket.com/soap-api-vs-rest-api-%EB%91%90-%EB%B0%A9%EC%8B%9D%EC%9D%98-%EA%B0%80%EC%9E%A5-%ED%81%B0-%EC%B0%A8%EC%9D%B4%EC%A0%90%EC%9D%80/
 * https://www.redhat.com/ko/topics/api/what-are-application-programming-interfaces
 * 
 * API는 어떤 서버의 특정한 부분에 접속해서 그 안에 있는 데이터와 서비스를 이용할 수 있게 해주는 소프트웨어 도구입니다. 
 * API를 이용하면 두 개의 소프트웨어가 서로 통신을 주고받을 수 있으며, 
 * 이는 우리가 모바일을 이용해서 하는 모든 행동들의 기반을 이루고 있다고 할 수 있습니다
 * 
 * REST API란 네트워크를 통해서 컴퓨터들끼리 통신할 수 있게 해주는 아키텍처 스타일이다.
 * REST API는 URI와 HTTP 프로토콜을 기반으로 한다.
 * 데이터 포맷으로는 JSON을 사용한다.
 * REST 방식의 API라면, 클라이언트-서버 모델로 구축되었다는 것을 의미하며, 정보의 페이로드(실제 전달하려는 내용)가 두 지점 사이를 왕복하게 됩니다.
 * REST는 웹에 최적화되어 있고, 데이터 포맷이 JSON이기 때문에 브라우저들 간에 호환성이 좋습니다. 또한, 그 성능과 확장성이 뛰어난 것
 */
	

//api에서 제공하는 참조 타입 사용하기
public class JavaObjectType {
	
	public static void main(String[] args) {
		
		int [] m = {1,2,3};				//배열 new없이 생성
		int [] n = new int[] {1,2,3};	//배열 new로 생성
		
		String card = "H8";				//String
		Date d = new Date();
		Calendar cal = Calendar.getInstance();
		
		System.out.println(card);
		System.out.println(d);
		System.out.println(cal);
	}
}
