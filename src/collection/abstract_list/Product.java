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
		sb.append("��ǰ ��ȣ : " + productNumber + "\t");
		sb.append("��ǰ �̸� : " + name + "\t");
		sb.append("��ǰ ���� : " + amount + "\t");
		sb.append("��ǰ ���� : " + price + "\t");
		sb.append("���� ȸ�� : " + manufacture + "\r\n");
		
		return sb.toString();
	}
	

}
