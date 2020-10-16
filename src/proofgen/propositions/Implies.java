package proofgen.propositions;

import proofgen.Proposition;

/**
 * Implication: A→B
 * @author harper
 *
 */
public class Implies implements Proposition {
	
	private Proposition left;
	private Proposition right;
	
	public Implies(Proposition left, Proposition right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public String LaTeXPrint() {
		return left.LaTeXPrint() + "\\rightarrow " + right.LaTeXPrint();
	}

	@Override
	public String JavaPrint() {
		return left.JavaPrint() + "→" + right.JavaPrint();
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
		
		if(!(o instanceof Implies)) {
			return false;
		}
		
		Implies i = (Implies) o;
		
		return (left.equals(i.left) && right.equals(i.right));
	}
}
