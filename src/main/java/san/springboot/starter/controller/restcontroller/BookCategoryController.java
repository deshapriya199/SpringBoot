package san.springboot.starter.controller.restcontroller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import san.springboot.starter.book.model.BookCategory;

@RestController
public class BookCategoryController {

	@RequestMapping("/rest/book/category")
	public List<BookCategory> bookCategory() {
		return Arrays.asList(new BookCategory(123, "Software"),
				new BookCategory(234, "Civil"),
				new BookCategory());
	}
}
