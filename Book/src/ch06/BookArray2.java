package ch06;

public class BookArray2 {
	public static void main(String[] args) {
		
		Book book1 = new Book("�¹���", "������");
		Book book2 = new Book("���̾�", "�츣�� �켼");
		Book book3 = new Book("��� �� ���ΰ�", "���ù�");
		Book book4 = new Book("����", "�ڰ渮");
		Book book5 = new Book("�����", "�������丮");

		
		book1.setBookName("�ﱹ��");
		book1.setAuthor("������");
		
		
		
		
		Book[] library = {book1, book2, book3, book4, book5};

		/*
		library[0] = new Book("�¹���", "������");
		library[1] = new Book("���̾�", "�츣�� �켼");
		library[2] = new Book("��� �� ���ΰ�", "���ù�");
		library[3] = new Book("����", "�ڰ渮");
		library[4] = new Book("�����", "�������丮");
		*/
		
		for(int i=0; i<library.length; i++) {			
			
			
			library[i].showBookInfo();
		}
		
	
		
	}

}
