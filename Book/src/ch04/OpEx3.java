package ch04;

public class OpEx3 {
	
	public static void main(String[] args) {
		
		int c = 10;
		int d = 10;
		
		++c;
		d++;
		
		System.out.println(c);
		System.out.println(d);
		
		int a = 10;
		int b = ++a;
		
		System.out.println("전위연산 결과 : "+b);
		
		int x = 10;
		int y = x++;
		
		System.out.println("후위연산 결과 : "+y);
		System.out.println("x : "+x);
		
		int e = 10;
		e++;
		System.out.println("e++ :" + e);
		int f = 10;
		f += 1;
		System.out.println("f += 1 : "+f);
		int g = 10;
		g = g + 1;
		System.out.println("g = g + 1 : " + g);
	}

}
