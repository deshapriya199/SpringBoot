package san.springboot.starter.category.model;

import san.springboot.starter.category.type.CategoryType;

public class Category {
	private CategoryType categoryType;
	private String url;
	
	public Category() {
	}
	
	/**
	 * @param id
	 * @param categoryType
	 */
	public Category(CategoryType categoryType) {
		this.categoryType = categoryType;
		this.url = categoryType.getUrl();
	}

	/**
	 * @return the categoryType
	 */
	public CategoryType getCategoryType() {
		return categoryType;
	}
	/**
	 * @param categoryType the categoryType to set
	 */
	public void setCategoryType(CategoryType categoryType) {
		this.categoryType = categoryType;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	
	
	
}
