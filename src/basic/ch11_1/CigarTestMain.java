package basic.ch11_1;

public class CigarTestMain {

	public static void main(String[] args) {
		Cigar cigar = new Cigar(new CigarLeaf("��û��"), new DryLeaf(5, 5), new Filter("���", 1.2));
		cigar.setId(2);
		Cigar cigar2 = new Cigar(new CigarLeaf("������"), new DryLeaf(3, 3), new Filter("�ְ��", 1.1));
		cigar2.setId(3);
		System.out.println(cigar);
		System.out.println(cigar2);
		cigar = cigar2;
		System.out.println(cigar);
		NewCigar extCigar = new NewCigar();
		System.out.println(extCigar);
	}

}
