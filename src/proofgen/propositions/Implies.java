package proofgen.propositions;

import proofgen.Proposition;

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
}
