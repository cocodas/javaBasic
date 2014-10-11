package basic.ch03;

public class ProfessionalCigarProduct implements OutSourcing {
	private TodayCigar todayCigar;

	@Override
	public void professionalCigarProduct() {
		todayCigar = new TodayCigar();
		todayCigar.leafSelected();
		todayCigar.leafDry();
		todayCigar.tarPercent();
		todayCigar.nicochinPercent();
		System.out.println("상품 완성");
		System.out.println("상품 포장");
	}
}
