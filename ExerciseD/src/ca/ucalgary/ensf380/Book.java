package ca.ucalgary.ensf380;

public abstract class Book {
	
	private String isbn;
	private String publicationYear;
	private int pages;
	
	// constructors
	public Book() {
		
	}
	
	public Book(String isbn, int pages) {
		this.isbn = isbn;
		this.pages = pages;
	}
	
	
	// getters and setters
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getPublicationYear() {
		return publicationYear;
	}

	public void setPublicationYear(String publicationYear) {
		this.publicationYear = publicationYear;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}
	
	
	
}
