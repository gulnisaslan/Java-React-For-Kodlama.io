package oopIntro;

public class Category {
	
    private int id;
    private String categoryName;
   
    public Category() {
    	
    }
    
    public Category(int id, String categoryName) {
		super();
		this.id = id;
		this.categoryName = categoryName;
	}
	public int getId() {
    	return this.id;
    }
    public void setId(int id) {
    	this.id=id;
    }
    public String getCategoryName() {
    	return this.categoryName;
    }   
    public void setCategoryName(String categoryName) {
    	this.categoryName=categoryName;
    }

}
