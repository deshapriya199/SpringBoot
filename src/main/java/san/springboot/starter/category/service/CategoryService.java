package san.springboot.starter.category.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import san.springboot.starter.category.model.Category;
import san.springboot.starter.category.type.CategoryType;

@Service
public class CategoryService {

	private List<Category> categories = Arrays.asList(
			new Category(CategoryType.BOOKS),
			new Category(CategoryType.CARS),
			new Category(CategoryType.FOODS),
			new Category(CategoryType.FURNETURE),
			new Category(CategoryType.GUNS),
			new Category(CategoryType.LAPTOP),
			new Category(CategoryType.PHONES),
			new Category(CategoryType.SPORT_GOODS),
			new Category(CategoryType.TELEVISION),
			new Category(CategoryType.WOOD)
			);
	
	public List<Category> getCategories(){
		return categories;
	}
}
