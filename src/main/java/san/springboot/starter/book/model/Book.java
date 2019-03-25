/**
 * 
 */
package san.springboot.starter.book.model;

/**
 * @author sdeshapriya
 *
 */
public class Book {
	private Integer id;
	private String name;
	private String isbn;
	private String auther;
	
	/**
	 * 
	 */
	public Book() {
	}
	/**
	 * @param id
	 * @param name
	 * @param isbn
	 * @param auther
	 */
	public Book(Integer id, String name, String isbn, String auther) {
		this.id = id;
		this.name = name;
		this.isbn = isbn;
		this.auther = auther;
	}
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the isbn
	 */
	public String getIsbn() {
		return isbn;
	}
	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	/**
	 * @return the auther
	 */
	public String getAuther() {
		return auther;
	}
	/**
	 * @param auther the auther to set
	 */
	public void setAuther(String auther) {
		this.auther = auther;
	}
	
	
}
