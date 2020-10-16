package proofgen.propositions;

import proofgen.Proposition;

/**
 * Not: ¬A
 * @author harper
 *
 */
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
	
	@Override
	public boolean equals(Object o) {
		if(o == this) {
			return true;
		}
		
		if(!(o instanceof Not)) {
			return false;
		}
		
		Not n = (Not) o;
		
		return(p.equals(n.p));
		
	}

}
