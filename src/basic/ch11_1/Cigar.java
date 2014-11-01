package basic.ch11_1;

/**
 * @author Rolend
 *
 */
public final class Cigar {
	private CigarLeaf cigarLeaf;
	private DryLeaf dryLeaf;
	private Filter filter;
	private int id = 1;
	
	public Cigar() {
		cigarLeaf = new CigarLeaf();
		dryLeaf = new DryLeaf();
		filter = new Filter();
		id++;
	}


	public Cigar(CigarLeaf cigarLeaf, DryLeaf dryLeaf, Filter filter) {
		this.cigarLeaf = cigarLeaf;
		this.dryLeaf = dryLeaf;
		this.filter = filter;
		id++;
	}


	public CigarLeaf getCigarLeaf() {
		return cigarLeaf;
	}


	public void setCigarLeaf(CigarLeaf cigarLeaf) {
		this.cigarLeaf = cigarLeaf;
	}


	public DryLeaf getDryLeaf() {
		return dryLeaf;
	}


	public void setDryLeaf(DryLeaf dryLeaf) {
		this.dryLeaf = dryLeaf;
	}


	public Filter getFilter() {
		return filter;
	}


	public void setFilter(Filter filter) {
		this.filter = filter;
	}
	


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(cigarLeaf);
		sb.append(dryLeaf);
		sb.append(filter);
		sb.append("ID: " + getId() + "\n");
		return sb.toString();
	}
}



