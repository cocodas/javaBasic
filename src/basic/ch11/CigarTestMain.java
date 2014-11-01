package basic.ch11;

public class CigarTestMain {

	public static void main(String[] args) {
		Cigar cigar = new Cigar(new CigarLeaf("충청도"), new DryLeaf(5, 5), new Filter("고급", 1.2));
		System.out.println(cigar);
	}

}
