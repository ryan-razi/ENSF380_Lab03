package ca.ucalgary.ensf380;

public class Novel extends Fiction {

	private Author[] theAuthors;
	private Series mySeries;
	
	@Override
	public String coverArt() {
		return "Method coverArt called from Novel";
	}
	
	public String theme() {
		return "Method theme called from Novel";
	}

	public Author[] getTheAuthors() {
		return theAuthors;
	}

	public void setTheAuthors(Author[] theAuthors) {
		this.theAuthors = theAuthors;
	}

	public Series getMySeries() {
		return mySeries;
	}

	public void setMySeries(Series mySeries) {
		this.mySeries = mySeries;
	}
	
	
	
}
