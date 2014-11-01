package basic.ch11;

/**
 * @author Rolend
 *
 */
public class Cigar {
	private CigarLeaf cigarLeaf;
	private DryLeaf dryLeaf;
	private Filter filter;
	
	public Cigar() {
		cigarLeaf = new CigarLeaf();
		dryLeaf = new DryLeaf();
		filter = new Filter();
	}


	public Cigar(CigarLeaf cigarLeaf, DryLeaf dryLeaf, Filter filter) {
		this.cigarLeaf = cigarLeaf;
		this.dryLeaf = dryLeaf;
		this.filter = filter;
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
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(cigarLeaf);
		sb.append(dryLeaf);
		sb.append(filter);
		return sb.toString();
	}
}



