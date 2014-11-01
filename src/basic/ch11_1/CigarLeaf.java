package basic.ch11_1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CigarLeaf {
	private String location;	// �������� ����� �����
	private Date productDate;	// ���� ����
	
	public CigarLeaf() {
		location = "��⵵";
		productDate = new Date(System.currentTimeMillis());
	}
	
	
	
	public CigarLeaf(String location) {
		this.location = location;
		productDate = new Date(System.currentTimeMillis());
	}



	public String getLocation() {
		return location;
	}



	public void setLocation(String location) {
		this.location = location;
	}



	public String getProductDate() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(productDate);
	}



	public void setProductDate(Date productDate) {
		this.productDate = productDate;
	}



	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("���� ����: " + location + "\n");
		sb.append("�� ���� ��¥: " + getProductDate() + "\n");
		return sb.toString();
	}
}
