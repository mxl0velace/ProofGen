package proofgen.propositions;

import proofgen.Proposition;

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

}
