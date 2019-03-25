package san.springboot.starter.category.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import san.springboot.starter.category.model.Category;
import san.springboot.starter.category.service.CategoryService;

@RestController
public class CategoryController {

	@Autowired
	private CategoryService categoryService;
	
	@RequestMapping("/rest/category")
	public List<Category> category() {
		return categoryService.getCategories();
	}
}
