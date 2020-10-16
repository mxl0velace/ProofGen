package proofgen.propositions;

import proofgen.Proposition;

/**
 * And: A∧B
 * @author harper
 *
 */
public class And implements Proposition {

	private Proposition left;
	private Proposition right;

	public And(Proposition left, Proposition right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public String LaTeXPrint() {
		return left.LaTeXPrint() + "\\land " + right.LaTeXPrint();
	}

	@Override
	public String JavaPrint() {
		return left.JavaPrint() + "∧" + right.JavaPrint();
	}
	
	//These are useful for auto-building proofs
	
	public Proposition getLeft() {
		return left;
	}
	
	public Proposition getRight() {
		return right;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o == this) {
			return true;
		}
		
		if(!(o instanceof And)) {
			return false;
		}
		
		And a = (And) o;
		
		return(left.equals(a.left) && right.equals(a.right));
		
	}

}
