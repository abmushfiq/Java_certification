package LibraryManagement;

public class Book {

	private int id;
	private String title;
	private String authorName;
	private int copies;
	private String[] tags;
	
	
	public Book(int id, String title, String authorName, int copies, String[] tags) {
		super();
		this.id = id;
		this.title = title;
		this.authorName = authorName;
		this.copies = copies;
		this.tags = tags;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthorName() {
		return authorName;
	}


	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}


	public int getCopies() {
		return copies;
	}


	public void setCopies(int copies) {
		this.copies = copies;
	}


	public String[] getTags() {
		return tags;
	}


	public void setTags(String[] tags) {
		this.tags = tags;
	}
	
	
	
	
	
	
	
	
	
}
