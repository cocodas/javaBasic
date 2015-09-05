package basic.pattern.command.part2;

public class ProcessReciever {
	public ProcessReciever() {
		// Empty
	}
	
	public void fermentation() {
		System.out.println("담배잎 발효");
	}
	
	public void heating() {
		System.out.println("담배잎 가열");
	}
	
	public void findFailureLeaf() {
		System.out.println("담배잎 불량제거");
	}
}
