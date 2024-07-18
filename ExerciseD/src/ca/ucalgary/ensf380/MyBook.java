package ca.ucalgary.ensf380;

public class MyBook {
	
	public static void main(String args[]) {
		
		// create the publisher
		Publisher publisher = new Publisher("John Cena", "WWE Stadium");
		
		// print out the publishers name
		System.out.println("Publishers name: " + publisher.getName());
		
		// create the authors one at a time
		Author author1 = new Author("Ryan Razi", "123 MyHouse Dr.", 20);
		Author author2 = new Author("Will Smith", "456 HisHouse Ave.", 40);
		
		// make an array for the authors of the book
		Author authors[] = {author1, author2};
		
		// print out the authors name
		System.out.println("Author1's name: " + author1.getName());
		System.out.println("Author2's name: " + author2.getName());
		
		// create a new novel
		Novel novel = new Novel();
		
		// create a series for the novel to be a part of
		Series series = new Series();
		series.setSeriesName("Hungry Games");
		
		// print out the series name
		System.out.println("Series name: " + series.getSeriesName());
		
		// set the variables for the novel since we couldn't in the constructor
		novel.setIsbn("0123456789876");
		novel.setPages(200);
		novel.setPublicationYear("2024");
		novel.setMySeries(series);	
		novel.setTheAuthors(authors);
		
		// print out the novel information
		System.out.println("Novels isbn: " + novel.getIsbn());
		System.out.println("Novels pages: " + novel.getPages());
		System.out.println("Novels publication year: " + novel.getPublicationYear());
		
		// create a contract between the publisher and the authors
		Contract contract = new Contract("7/18/2024", publisher, authors);
		
		// print statement to get the date, publisher and authors from the contract, as well as print out their names from getting those things
		System.out.println("New contract created on " + contract.getDate() + " between " + contract.getPublisherInfo().getName() + 
				", and the book writing duo of " + contract.getAuthorInfo()[0].getName() + " and " + contract.getAuthorInfo()[1].getName());
		
		
	}
	
}
