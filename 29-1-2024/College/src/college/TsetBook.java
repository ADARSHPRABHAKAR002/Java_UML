package college;

public class TsetBook {

	public static void main(String[] args) {
		
		Author author=new Author("deepak","deepak@gmail.com",'M');
		
		Book book=new Book("kannada",author,55.5,20);
		
		
		System.out.println(book.tostring());

	}

}
