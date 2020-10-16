package proofgen.rules.natural;

import proofgen.Proposition;
import proofgen.Rule;
import proofgen.propositions.Implies;

/**
 * Implication introduction rule #[→I]: Assume A, prove B, discharge A to get A→B.
 * @author harper
 *
 */
public class ImplicationIntroduction implements Rule {
	
	private Assumption assumption;
	private Rule top;
	private Implies result;

	public ImplicationIntroduction(Assumption assumption, Rule top) {
		this.assumption = assumption;
		this.top = top;
		this.result = new Implies(assumption.getResult(),top.getResult());
	}

	@Override
	public String LaTeXPrint() {
		return "\\infer["+assumption.getNumber()+"{[\\rightarrow I]}]{"+result.LaTeXPrint()+"}{"+top.LaTeXPrint()+"}";
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

}
