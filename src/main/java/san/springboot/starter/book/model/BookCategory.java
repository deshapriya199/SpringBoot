package san.springboot.starter.book.model;

public class BookCategory {
	private Integer bookId;
	private String name;
	
	public BookCategory() {
	}
	
	public BookCategory(Integer bookId, String name) {
		this.bookId = bookId;
		this.name = name;
	}
	/**
	 * @return
	 */
	public Integer getBookId() {
		return bookId;
	}
	/**
	 * @param bookId
	 */
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	/**
	 * @return
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	
}
