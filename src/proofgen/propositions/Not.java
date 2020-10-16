package proofgen.propositions;

import proofgen.Proposition;

public class Not implements Proposition {
	
	private Proposition p;

	public Not(Proposition p) {
		this.p = p;
	}

	@Override
	public String LaTeXPrint() {
		return "\\lnot " + p.LaTeXPrint();
	}

	@Override
	public String JavaPrint() {
		return "¬" + p.JavaPrint();
	}

}
