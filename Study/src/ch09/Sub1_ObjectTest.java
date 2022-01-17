package ch09;
/*
 * 날짜 : 2022/01/11
 * 내용 : 자바 오프젝트 내장 클래스 
 * 이름 : 김병현
 */

public class Sub1_ObjectTest {
	public static void main(String[] args) {
		
		//자바의 최상위 클래스 object로 업캐스팅(다형성)
		Object apple = new Apple("한국", 5000);
		Object banana = new Banana("일본", 3000);
		
		apple.toString();
		banana.toString();
		
	}

}
