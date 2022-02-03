package ch06;

class B {
	boolean m1;
	int m2;
	double m3;
	String m4;
	void printfieldValue() {
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
	}
	void printLocalVariable() {
		int k;
	}
}

public class InitialValueOfFieldAndLocalVariable {
	public static void main(String[] args) {
		
		B a = new B();
		
		a.printfieldValue();
	}
	

}
