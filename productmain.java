class Product{
	public int code, price;
	public String name;
	
	
	Product(int product_code, String product_name, int product_price){
		this.name = product_name;
		this.code = product_code;
		this.price = product_price;
	}
	
	
}

class ProductMain{
	public static void main(String args[]){
		Product iphone12 = new Product(123, "I Phone 12", 150000);
		Product dove = new Product(111, "Dove Soap", 60);
		Product tv = new Product(12345, "Samsung", 200000);
		
		System.out.println("Product name : "  + iphone12.name + " Product code : "+ iphone12.code + " Price : " + iphone12.price);
		System.out.println("Product name : "  + dove.name + " Product code : "+ dove.code + " Price : " + dove.price);
		System.out.println("Product name : "  + tv.name + " Product code : "+ tv.code + " Price : " + tv.price);
	}
}
