package ch03;

public class ScopeEx {
	
	public static void main(String[] args) {
		
		String name;
		
		if(true) {
			name = "ȫ�浿";
			String email = "hong@test.com";
		}
		//email = hong@test.com;
	}

}
