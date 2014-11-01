package basic.ch11_1;

import basic.ch11.Cigar;

public class NewCigar extends Cigar {
	private int id = 1;
	
	public NewCigar() {
		super();
		id++;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return String.valueOf(id);
	}
}
