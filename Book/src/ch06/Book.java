package ch06;

public class Book {

		private String bookName;
		private String author;
		
		public Book() {} //<=default 생성자 어디다 씀?
		
		public Book(String bookName, String author) {
			this.bookName = bookName;
			this.author = author;
		}
		
		public String getBookName() { // <-- 겟터 세터 없어도 실행됨
                                       //사용처를 모름			
			return bookName;
		}
		public void setBookName(String bookName) {
			this.bookName = bookName;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public void showBookInfo() {
			System.out.println(bookName+ "," +author);
		}
		
		
	}


