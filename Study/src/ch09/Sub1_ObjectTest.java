package ch09;
/*
 * ��¥ : 2022/01/11
 * ���� : �ڹ� ������Ʈ ���� Ŭ���� 
 * �̸� : �躴��
 */

public class Sub1_ObjectTest {
	public static void main(String[] args) {
		
		//�ڹ��� �ֻ��� Ŭ���� object�� ��ĳ����(������)
		Object apple = new Apple("�ѱ�", 5000);
		Object banana = new Banana("�Ϻ�", 3000);
		
		apple.toString();
		banana.toString();
		
	}

}
