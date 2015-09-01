package collection.hash_map.hash_map_test;

public class Vegetable {
	
	private String vegetableName;
	private int count;
	private String grade;
	private double weight;
	private int price;
	private String home;
	private String producerNumber;
	
	public Vegetable(VegetableBuilder vegetableBuilder) {
		vegetableName = vegetableBuilder.vegetableName;
		count = vegetableBuilder.count;
		grade = vegetableBuilder.grade;
		weight = vegetableBuilder.weight;
		price = vegetableBuilder.price;
		home = vegetableBuilder.home;
		producerNumber = vegetableBuilder.producerNumber;
		
	}
	
	public static class VegetableBuilder {
		private String vegetableName;
		private int count;
		private String grade;
		private double weight;
		private int price;
		private String home;
		private String producerNumber;
		
		public VegetableBuilder vegetableName(String vegetableName) {
			this.vegetableName = vegetableName;
			return this;
		}
		
		public VegetableBuilder count(int count) {
			this.count = count;
			return this;
		}
		
		public VegetableBuilder grade(String grade) {
			this.grade = grade;
			return this;
		}
		
		public VegetableBuilder weight(double weight) {
			this.weight = weight;
			return this;
		}
		
		public VegetableBuilder price(int price) {
			this.price = price;
			return this;
		}
		
		public VegetableBuilder home(String home) {
			this.home = home;
			return this;
		}
		
		public VegetableBuilder producerNumber(String producerNumber) {
			this.producerNumber = producerNumber;
			return this;
		}
		
		public Vegetable builder(){
			return new Vegetable(this);
		}
		
	}

	public String getVegetableName() {
		return vegetableName;
	}

	public void setVegetableName(String vegetableName) {
		this.vegetableName = vegetableName;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
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

	public String getProducerNumber() {
		return producerNumber;
	}

	public void setProducerNumber(String producerNumber) {
		this.producerNumber = producerNumber;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("ä�� �̸� : [ " + vegetableName + " ] \t");
		sb.append("�ֹ� ���� : [ " + count + "�� ] \t");
		sb.append("��� : [ " + grade + " ] \t");
		sb.append("�߷� : [ " + weight + " Kg ] \t");
		sb.append("���� : [ " + price + "�� ] \t");
		sb.append("������ : [ " + home + " ] \t");
		sb.append("������ ����ó : [ " + producerNumber + " ] \r\n");
		
		return sb.toString();
	}
	
	

}
