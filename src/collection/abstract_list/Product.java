package collection.abstract_list;

public class Product {
	private int productNumber;
	private String name;
	private int amount;
	private int price;
	private String manufacture;
	
	public Product(ProductBuilder productBuilder) {
		productNumber = productBuilder.productNumber;
		name = productBuilder.name;
		amount = productBuilder.amount;
		price = productBuilder.price;
		manufacture = productBuilder.manufacture;
	}
	
	public static class ProductBuilder {
		private int productNumber;
		private String name;
		private int amount;
		private int price;
		private String manufacture;
		
		public ProductBuilder productNumber(int productNumber) {
			this.productNumber = productNumber;
			return this;
		}
		
		public ProductBuilder name(String name) {
			this.name = name;
			return this;
		}
		
		public ProductBuilder amount(int amount) {
			this.amount = amount;
			return this;
		}
		
		public ProductBuilder price(int price) {
			this.price = price;
			return this;
		}
		
		public ProductBuilder manufacture(String manufacture) {
			this.manufacture = manufacture;
			return this;
		}
		
		public Product builder() {
			return new Product(this);
		}

	}

	public int getProductNumber() {
		return productNumber;
	}

	public void setProductNumber(int productNumber) {
		this.productNumber = productNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getManufacture() {
		return manufacture;
	}

	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("제품 번호 : " + productNumber + "\t");
		sb.append("제품 이름 : " + name + "\t");
		sb.append("제품 수량 : " + amount + "\t");
		sb.append("제품 가격 : " + price + "\t");
		sb.append("제조 회사 : " + manufacture + "\r\n");
		
		return sb.toString();
	}
	

}
