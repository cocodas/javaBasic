package basic.ch03;
/*
 * signature: method name과 인자를 나타낸다.
 */
public interface CigaMaker extends FutureCigar{
	public final int CIGAPRICE = 2500;
	
	public void leafDry();
	public void leafSelected();

	/*
	 * [private, protected, public, default] [final] [return Type] [method name] (args...) {
	 * 	// method body
	 * }
	 */
}
