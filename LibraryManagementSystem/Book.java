package Solution;

public class Book {

	    private String title;
	    private String author;
	    private boolean isIssued;
	    
	    
		public Book(String title, String author, boolean isIssued) {
			super();
			this.title = title;
			this.author = author;
			this.isIssued = isIssued;
		}
		
		
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public boolean isIssued() {
			return isIssued;
		}
		public void setIssued(boolean isIssued) {
			this.isIssued = isIssued;
		}
		
		
		@Override
	    public String toString() {
	        return title + " by " + author + (isIssued ? " (Issued)" : " (Available)");
	    }


		public void returnBook() {
			// TODO Auto-generated method stub
			
		}


		public void issue() {
			// TODO Auto-generated method stub
			
		}
	    
		
		
	    

	
}
