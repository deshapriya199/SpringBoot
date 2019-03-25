/**
 * 
 */
package san.springboot.starter.book.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import san.springboot.starter.book.model.Book;
import san.springboot.starter.book.service.BookService;

/**
 * @author sdeshapriya
 *
 */
@RestController
public class BookController {
	
	@Autowired
	private BookService bookService;

	@RequestMapping("/rest/books")
	public List<Book> allBooks(){
		return bookService.allBooks();
	}
	
	@RequestMapping("/rest/books/{id}")
	public Book bookById(@PathVariable Integer id){
		return bookService.bookById(id);
	}
}
