package ch06;

public class BookArray2 {
	public static void main(String[] args) {
		
		Book book1 = new Book("태백산맥", "조정래");
		Book book2 = new Book("데미안", "헤르만 헤세");
		Book book3 = new Book("어떻게 살 것인가", "유시민");
		Book book4 = new Book("토지", "박경리");
		Book book5 = new Book("어린왕자", "생텍쥐페리");

		
		book1.setBookName("삼국지");
		book1.setAuthor("나관중");
		
		
		
		
		Book[] library = {book1, book2, book3, book4, book5};

		/*
		library[0] = new Book("태백산맥", "조정래");
		library[1] = new Book("데미안", "헤르만 헤세");
		library[2] = new Book("어떻게 살 것인가", "유시민");
		library[3] = new Book("토지", "박경리");
		library[4] = new Book("어린왕자", "생텍쥐페리");
		*/
		
		for(int i=0; i<library.length; i++) {			
			
			
			library[i].showBookInfo();
		}
		
	
		
	}

}
