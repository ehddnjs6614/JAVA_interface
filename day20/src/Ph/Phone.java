package Ph;

//Phone 인터페이스 (추상 클래스) 내에서 모든 핸드폰이 사용하는 기능정의
//phone2g ,phone3g,phone4g에 구현
// user 클래스에서 3가지 전부 사용해보기

public interface Phone {

	//2g
	 void msg(String str, String tel); //문자
	 void call(String tel); //전화
	 
	 void  useInterent();
}
