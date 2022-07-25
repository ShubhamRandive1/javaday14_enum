package javadayday19Q1;

public class Product {
	
	private int productId;
	
	private String productName;
	
	private double productPrice;
	
	@Override
	public String toString() {
		
		return "Product {Id = "+" "+productId+" "+"Name"+" "+productName+"Price"+" "+productPrice+"}";  
		
	}

	public Product() {
		super();
	}

	public Product(int productId, String productName, double productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	
	

}
