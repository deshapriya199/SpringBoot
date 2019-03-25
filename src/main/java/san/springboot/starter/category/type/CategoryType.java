package san.springboot.starter.category.type;

public enum CategoryType {
	BOOKS("/rest/book/category"), 
	FOODS(), 
	SPORT_GOODS(), 
	FURNETURE(),
	LAPTOP(), 
	TELEVISION(),
	PHONES(),
	CARS(),
	GUNS(),
	WOOD(),
	;
	
	private String url;
	
	private CategoryType() {}
	
	private CategoryType(String url) {
		this.url = url;
	}
	
	public String getUrl() {
		return url;
	}
	
}
