package collection.hash_map.hash_map_test;

public class Fruit{
	
	private String fruitName;
	private int count;
	private double weight;
	private int price;
	private String home;
	private long producerNumber;
	
	public Fruit(FruitBuilder fruitBuilder) {
		fruitName = fruitBuilder.fruitName;
		count = fruitBuilder.count;
		weight = fruitBuilder.weight;
		price = fruitBuilder.price;
		home = fruitBuilder.home;
		producerNumber = fruitBuilder.producerNumber;
	}
	
	public static class FruitBuilder{
		private String fruitName;
		private int count;
		private double weight;
		private int price;
		private String home;
		private long producerNumber;
		
		public FruitBuilder fruitName(String fruitName) {
			this.fruitName = fruitName;
			return this;
		}
		
		public FruitBuilder count(int count) {
			this.count = count;
			return this;
		}
		
		public FruitBuilder weight(double weight) {
			this.weight = weight;
			return this;
		}
		
		public FruitBuilder price(int price) {
			this.price = price;
			return this;
		}
		
		public FruitBuilder home(String home) {
			this.home = home;
			return this;
		}
		
		public FruitBuilder producerNumber(long producerNumber) {
			this.producerNumber = producerNumber;
			return this;
		}
		
		public Fruit builder() {
			return new Fruit(this);
		}
	}

	public String getFruitName() {
		return fruitName;
	}

	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getHome() {
		return home;
	}

	public void setHome(String home) {
		this.home = home;
	}

	public long getProducerNumber() {
		return producerNumber;
	}

	public void setProducerNumber(long producerNumber) {
		this.producerNumber = producerNumber;
	}
	
	@Override
	public String toString() {
		
		StringBuffer sb = new StringBuffer();
		sb.append("���� �̸� : [ " + fruitName + " ] \t");
		sb.append("�ֹ� ���� : [ " + count + "�� ] \t");
		sb.append("�߷� : [ " + weight + "g ] \t" );
		sb.append("���� : [ " + price + "�� ] \t" );
		sb.append("������ : [ " + home + " ] \t");
		sb.append("������ ����ó : [ " + producerNumber + " ] \r\n");
		
		return sb.toString();
	}
	
}
