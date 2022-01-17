package ch07;

public class Singleton { //객체의 값이 같아야 할때 static 
	
	//static 변수
	private static Singleton instance = new Singleton();
	
	//생성자에 private 접근 제한자
	private Singleton() {
		System.out.println("객체 생성");
	}
	
	// static 메서드
	public static Singleton getInstance() {
		System.out.println("객체 리턴");
		return instance;
	}

}
