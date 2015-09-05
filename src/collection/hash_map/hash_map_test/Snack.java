package collection.hash_map.hash_map_test;

public class Snack {
	private String snackName;
	private int count;
	private int weight;
	private String expirationDate;
	private String manufactureCompany;
	private int price;
	
	public Snack(SnackBuilder snackBuilder) {
		snackName = snackBuilder.snackName;
		count = snackBuilder.count;
		weight = snackBuilder.weight;
		expirationDate = snackBuilder.expirationDate;
		manufactureCompany = snackBuilder.manufactureCompany;
		price = snackBuilder.price;
		
	}
	
	public static class SnackBuilder{
		
		private String snackName;
		private int count;
		private int weight;
		private String expirationDate;
		private String manufactureCompany;
		private int price;
		
		public SnackBuilder snackName(String snackName) {
			this.snackName = snackName;
			return this;
		}
		
		public SnackBuilder count(int count) {
			this.count = count;
			return this;
		}
		
		public SnackBuilder weight(int weight) {
			this.weight = weight;
			return this;
		}
		
		public SnackBuilder expirationDate(String expiratuonDate) {
			this.expirationDate = expiratuonDate;
			return this;
		}
		
		public SnackBuilder manufactureCompany(String manufactureCompany) {
			this.manufactureCompany = manufactureCompany;
			return this;
		}
		
		public SnackBuilder price(int price) {
			this.price = price;
			return this;
		}
		
		public Snack builder(){
			return new Snack(this);
		}
	}

	public String getSnackName() {
		return snackName;
	}

	public void setSnackName(String snackName) {
		this.snackName = snackName;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getManufactureCompany() {
		return manufactureCompany;
	}

	public void setManufactureCompany(String manufactureCompany) {
		this.manufactureCompany = manufactureCompany;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("스낵 이름 : [ " + snackName + " ] \t\t");
		sb.append("수량 : [ " + count + " 개 ] \t\t");
		sb.append("중량 : [ " + weight + "g ] \t\t");
		sb.append("유통기한 : [ " + expirationDate + " ] \t\t" );
		sb.append("제조사 : [ " + manufactureCompany + " ] \t\t");
		sb.append("가격 : [ " + price + " 원] \r\n");
		return sb.toString();
	}

}
