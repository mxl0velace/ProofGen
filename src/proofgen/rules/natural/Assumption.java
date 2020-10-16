package proofgen.rules.natural;

import proofgen.Proposition;
import proofgen.Rule;

/**
 * Assumption: Assume that a proposition is true.
 * If assumption = 0, do not draw the "assumption line": just place the proposition at the leaf of the tree
 * @author harper
 *
 */
public class Assumption implements Rule {
	
	private int assumption;
	private Proposition result;

	public Assumption(int assumption, Proposition result) {
		this.assumption = assumption;
		this.result = result;
	}

	@Override
	public String LaTeXPrint() {
		if(assumption > 0) {
			return "\\infer["+assumption+"]{"+result.LaTeXPrint()+"}{}";
		} else {
			return result.LaTeXPrint();
		}
	}

	@Override
	public String JavaPrint() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Proposition getResult() {
		return result;
	}
	
	public int getNumber() {
		return assumption;
	}

}
