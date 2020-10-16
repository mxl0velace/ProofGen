package proofgen.propositions;

import proofgen.Proposition;

/**
 * Or: A∨B
 * @author harper
 *
 */
public class Or implements Proposition {

	private Proposition left;
	private Proposition right;

	public Or(Proposition left, Proposition right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public String LaTeXPrint() {
		return left.LaTeXPrint() + "\\land " + right.LaTeXPrint();
	}

	@Override
	public String JavaPrint() {
		return left.JavaPrint() + "∨" + right.JavaPrint();
	}
	
	@Override
	public boolean equals(Object o) {
		if(o == this) {
			return true;
		}
		
		if(!(o instanceof Or)) {
			return false;
		}
		
		Or a = (Or) o;
		
		return(left.equals(a.left) && right.equals(a.right));
		
	}
	
	//These are useful for auto-building proofs
	
		public Proposition getLeft() {
			return left;
		}
		
		public Proposition getRight() {
			return right;
		}

}
