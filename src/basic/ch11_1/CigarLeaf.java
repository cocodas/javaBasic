package basic.ch11_1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CigarLeaf {
	private String location;	// 지역에서 생산된 담배잎
	private Date productDate;	// 생산 일자
	
	public CigarLeaf() {
		location = "경기도";
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
		sb.append("생산 지역: " + location + "\n");
		sb.append("잎 생산 날짜: " + getProductDate() + "\n");
		return sb.toString();
	}
}
