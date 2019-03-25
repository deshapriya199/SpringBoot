/**
 * 
 */
package san.springboot.starter.book.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import san.springboot.starter.book.model.Book;

/**
 * @author sdeshapriya
 *
 */
@Service
public class BookService {
	
	private List<Book> books = Arrays.asList(
			new Book(1,"Head First Java", "212hhhas","sanjaya"),
			new Book(2,"Head First C#", "2312DGDFG","sanjaya"),
			new Book(3,"Head First Python", "2424DSFD","sanjaya")
			);
	
	public List<Book> allBooks(){
		return books;
	}
	
	public Book bookById(Integer id) {
		return books.stream().filter(book -> book.getId().equals(id)).findFirst().get();
	}
}
